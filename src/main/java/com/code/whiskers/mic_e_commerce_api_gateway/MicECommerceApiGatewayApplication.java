package com.code.whiskers.mic_e_commerce_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicECommerceApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicECommerceApiGatewayApplication.class, args);
	}

}
