package com.example.SpringCloudApiGatewayEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudApiGatewayExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApiGatewayExApplication.class, args);
	}

}
