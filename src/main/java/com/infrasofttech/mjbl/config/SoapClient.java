package com.infrasofttech.mjbl.config;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.infrasofttech.mjbl.wsATS.SessionT;

public class SoapClient extends WebServiceGatewaySupport {
	
	public SessionT getSessionId(String url, Object request) {
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive(url,request);
		return (SessionT)res.getValue();
		
	}

}
