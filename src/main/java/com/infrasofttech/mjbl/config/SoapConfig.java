package com.infrasofttech.mjbl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.infrasofttech.mjbl.wsATS");
		
		return marshaller;
		
	}
	
	@Bean
	public SoapClient soapConnector(Jaxb2Marshaller marshaller) {
		SoapClient soapClient = new SoapClient();
		soapClient.setDefaultUri("http://172.16.2.8:7080/GWClientMUService/GWClientMU");
		soapClient.setMarshaller(marshaller);
		soapClient.setUnmarshaller(marshaller);
		return soapClient;
		
	}
}
