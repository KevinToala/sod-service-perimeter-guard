package com.serviceperimeterguard.intermediary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;

@SpringBootApplication
public class SodIntermediaryApplication {

	public static void main(String[] args){
		SpringApplication.run(SodIntermediaryApplication.class, args);
	}
	
	@Bean
	public RestOperations rest(RestTemplateBuilder restTemplateBuilder){
		return restTemplateBuilder.basicAuthorization("admin", "12345678").build();
	}
}