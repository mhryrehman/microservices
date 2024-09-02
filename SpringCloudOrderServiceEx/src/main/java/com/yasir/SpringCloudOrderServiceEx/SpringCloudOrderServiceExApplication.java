package com.yasir.SpringCloudOrderServiceEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RefreshScope   //for actuator to refresh remote server configurations
public class SpringCloudOrderServiceExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOrderServiceExApplication.class, args);
	}

}
