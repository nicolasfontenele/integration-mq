package com.bnb.integration;

import java.util.Properties;

/**
 * 
 * @author nicolas
 * 
 *         Class Responsible to store all component configuration
 * 
 */

public class IntegratorConfiguration {

	private static IntegratorConfiguration single;
	private static boolean instanceFlag = false;

	private IntegratorConfiguration() {

	}

	public static IntegratorConfiguration getInstance() {
		if (!instanceFlag) {
			single = new IntegratorConfiguration();
			instanceFlag = true;
		}
		return single;
	}

	private String queueInName;
	private String queueInHostname;
	private String queuePort;
	private String queueChannel;
	private String queueOutName;
	private String queueOutHostname;
	private String cpfOrCnpj;
	private String userCPF;
	private String managerName;
	
	
	public String getQueuePort() {
		return queuePort;
	}

	public void setQueuePort(String queuePort) {
		this.queuePort = queuePort;
	}

	public String getQueueChannel() {
		return queueChannel;
	}

	public void setQueueChannel(String queueChannel) {
		this.queueChannel = queueChannel;
	}


	public void buildConfigurationFromProperties(Properties properties) {

		queueInName = properties.getProperty("queue_in_name");
		queueInHostname = properties.getProperty("queue_in_host");
		queuePort = properties.getProperty("queue_port");
		queueChannel = properties.getProperty("queue_channel");
		queueOutName = properties.getProperty("queue_out_name");
		queueOutHostname = properties.getProperty("queue_out_host");
		cpfOrCnpj = properties.getProperty("pessoa");
		userCPF = properties.getProperty("cpf_usuario");
		managerName = properties.getProperty("queue_manager");
	}

	public String getQueueInName() {
		return queueInName;
	}

	public void setQueueInName(String queueInName) {
		this.queueInName = queueInName;
	}

	public String getQueueInHostname() {
		return queueInHostname;
	}

	public void setQueueInHostname(String queueInHostname) {
		this.queueInHostname = queueInHostname;
	}

	public String getQueueOutName() {
		return queueOutName;
	}

	public void setQueueOutName(String queueOutName) {
		this.queueOutName = queueOutName;
	}

	public String getQueueOutHostname() {
		return queueOutHostname;
	}

	public void setQueueOutHostname(String queueOutHostname) {
		this.queueOutHostname = queueOutHostname;
	}

	public String getCpfOrCnpj() {
		return cpfOrCnpj;
	}

	public void setCpfOrCnpj(String cpfOrCnpj) {
		this.cpfOrCnpj = cpfOrCnpj;
	}

	public String getUserCPF() {
		return userCPF;
	}

	public void setUserCPF(String userCPF) {
		this.userCPF = userCPF;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

}
