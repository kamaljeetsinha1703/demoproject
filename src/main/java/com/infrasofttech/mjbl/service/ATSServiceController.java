package com.infrasofttech.mjbl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infrasofttech.mjbl.config.SoapClient;
import com.infrasofttech.mjbl.wsATS.LogonT;
import com.infrasofttech.mjbl.wsATS.ObjectFactory;
import com.infrasofttech.mjbl.wsATS.SessionT;


@RestController
public class ATSServiceController {
	
	@Autowired
	public SoapClient soapClient;
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "Welcome to ATS Service";
	}
	
	@GetMapping("/ats")
	public SessionT getSessionId() {
		
		ObjectFactory of = new ObjectFactory();
		LogonT logon = new LogonT();
		logon.setClientWSUrl("");
		logon.setPassword("1");
		logon.setUsername("MJBLLALABXXX");
		logon.setSignature("");
		SessionT res = soapClient.getSessionId("http://172.16.2.8:7080/GWClientMUService/GWClientMU", of.createLogon(logon));
		return res;
		
	}
	
	
}
