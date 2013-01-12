package com.bnb.integration;

import java.util.List;

import com.bnb.mq.MQManager;
import com.bnb.ws.ServiceClient;
import com.bnb.ws.cnpj.ArrayOfBNBCNPJPerfil1;
import com.bnb.ws.cnpj.ArrayOfBNBCNPJPerfil2;
import com.bnb.ws.cnpj.BNBCNPJPerfil1;
import com.bnb.ws.cnpj.BNBCNPJPerfil2;
import com.bnb.ws.cnpj.consume.ServiceClientCNPJ;
import com.bnb.ws.cpf.ArrayOfBNBPessoaPerfil1;
import com.bnb.ws.cpf.ArrayOfBNBPessoaPerfil2;
import com.bnb.ws.cpf.consume.ServiceClientCPF;
import static org.mockito.Mockito.*;


public class Integrator {
	
	MQManager mqManager;
	Parser parser; 
	ServiceClient client;
	
	
	public Integrator() {
		parser = new Parser();
		mqManager = new MQManager();
		
	}

	
	public void doIntegration(IntegratorConfiguration configuration)
	{
		List<String> data = retrieveDataFromMQ();
		List<String> parsedData = parseData(data);
		
		initializeClient(configuration);
		
		mockService();
		
		for (String eachParsedData: parsedData)
		{
			Object wsListData = client.consume(eachParsedData, configuration.getUserCPF() ); 
			String parsedToMq = parser.parseFromWSToMQ( wsListData);
			publicIntoMQ(wsListData);
		}
		
		
	}
	
	private void mockService() {
		
		if (client instanceof ServiceClientCNPJ)
		{
		
        ArrayOfBNBCNPJPerfil1 perfil = new ArrayOfBNBCNPJPerfil1();
        BNBCNPJPerfil1 example = new BNBCNPJPerfil1();
        example.setCidadeExterior("fortaleza");
        example.setErro("algum erro");
        example.setSituacaoCadastral("nao cadastrado");
        // set more thing on example
        perfil.getCNPJPerfil1().add(example);
		
		client = mock(ServiceClient.class);
		
		when(client.consume(anyString(), anyString())).thenReturn(perfil);
		}
	}


	public void publicIntoMQ(Object wsListData) {
		
		
		if (wsListData instanceof ArrayOfBNBCNPJPerfil1)
		{			
			//do a for loop public each data into MQ
			mqManager.sendMessage(((ArrayOfBNBCNPJPerfil1) wsListData).getCNPJPerfil1().get(0).getCidadeExterior());
			
		} else if (wsListData instanceof ArrayOfBNBPessoaPerfil1)
		{
			//do a for loop to public each data into MQArrayOfBNBPessoaPerfil2
			mqManager.sendMessage(((ArrayOfBNBPessoaPerfil1) wsListData).getPessoaPerfil1().get(0).getCPF());
		}
		
		
	}

	public List<String> retrieveDataFromMQ()
	{
		return mqManager.receiveMessage();		
	}
	
	public List<String> parseData(List<String> dataMQ)
	{
		return parser.parseFromMQToWS(dataMQ);
	}

	private void initializeClient(IntegratorConfiguration configuration) {
		if ( "cnpj".equals(configuration.getCpfOrCnpj()))
		{
			client = new ServiceClientCNPJ();
		}
		else {
			client = new ServiceClientCPF();
		}
	}
	
}
