package com.bnb.mq;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import com.bnb.integration.IntegratorConfiguration;
import com.bnb.main.BNBComponent;
import com.bnb.util.Util;
import com.ibm.mq.MQException;

public class MQManager {

	private MQSender mqSender;
	private MQReceiver mqReceiver;
	private IntegratorConfiguration configuration;
	
	public MQManager() {
		
		configuration = IntegratorConfiguration.getInstance();
		
		mqReceiver = new MQReceiver(configuration.getQueueInHostname(),
				Integer.valueOf(configuration.getQueuePort()), configuration.getQueueChannel());
		mqSender= new MQSender(configuration.getQueueOutHostname(),
				Integer.valueOf(configuration.getQueuePort()), configuration.getQueueChannel());

	}

	public void sendMessage(String message) {

		try {
			mqSender.connect(configuration.getManagerName());
			mqSender.send(configuration.getQueueOutName(), message);
			mqSender.disconnect();
		} catch (MQException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<String> receiveMessage() {
		
		List<String> result = new ArrayList<String>();
		
		try {
			Util.info("Tentando se conectar a fila: "  + configuration.getQueueInName());
			mqReceiver.connect(configuration.getManagerName());
			Util.info("Conectado a fila: "  + configuration.getQueueInName());
			
			
			while (true) {
				String message = null;

				try {
					Util.info("Tentando receber uma mensagem");
					message = mqReceiver.receive(configuration.getQueueInName());
					result.add(message);

				} catch (MQException e) {
					if (e.getReason() == 2033) {
						mqReceiver.disconnect();
						return result;
						
					}
				}

				Util.info("Mensagem recebida: " + message);
			}			
			

		} catch (MQException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				Util.info("Tentando desconectar da fila " + configuration.getQueueInName());
				mqReceiver.disconnect();
				Util.info("desconectado da fila " + configuration.getQueueInName());
			} catch (MQException e) {
				Util.severe("Nao foi possível desconectar da fila" + configuration.getQueueInName());
			}
		}
		return result;
	}
}
