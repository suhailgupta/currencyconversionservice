package com.suhail.microservices.currencyexchangeservice.currencyconversionservice.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com.suhail.microservices.currencyexchangeservice.currencyconversionservice.currencyconversionservice")
@EnableDiscoveryClient
//@EnableCircuitBreaker
public class CurrencyconversionserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyconversionserviceApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
