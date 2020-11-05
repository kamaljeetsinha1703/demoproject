package com.infrasofttech.mjbl.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication(scanBasePackages={"com.infrasofttech.mjbl"})
@EnableScheduling
@EntityScan(basePackages = "com.*")
public class ATSServiceStart {
	private static final Logger logger = LogManager.getLogger(ATSServiceStart.class);
	

	
	public static void main(String[] args) {
		logger.info("ATS Service started...");
		SpringApplication.run(ATSServiceStart.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "Welcome to ATS Service";
	}
	

	
}
