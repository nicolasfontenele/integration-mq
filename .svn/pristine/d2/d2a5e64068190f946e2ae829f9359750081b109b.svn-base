package com.bnb.ws.cpf.consume;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.bnb.ws.ServiceClient;
import com.bnb.ws.cnpj.ConsultarCNPJ;
import com.bnb.ws.cpf.ConsultarCPF;
import com.bnb.ws.cpf.ConsultarCPFSoap;

import static org.mockito.Mockito.*;

public class ServiceClientCPF extends ServiceClient {

	public ServiceClientCPF() {
		mockService();
	}
	
	public void mockService() {
		
		when(this.consume("01236702336;03511337399", "01236702336")).thenReturn(null);
			
	}

	@Override
	public QName getServiceName() {
		return new QName("http://cpf.infoconv.s255.bnb.gov.br/", "ConsultarCPF");
	}

	@Override
	public Object consume(String parsedList, String cpfUsuario) {
		
		ConsultarCPF ss = new ConsultarCPF(getWSDLLocation(), getServiceName());
        ConsultarCPFSoap port = ss.getConsultarCPF(); 
        return port.consultarCPFP1(parsedList, cpfUsuario);
	}

	@Override
	public URL getWSDLLocation() {
		URL wsdlURL = ConsultarCNPJ.WSDL_LOCATION;
            File wsdlFile = new File("resources/S146_XML_ConsultarCPF.wsdl");
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } 
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        return wsdlURL;
	}

}

