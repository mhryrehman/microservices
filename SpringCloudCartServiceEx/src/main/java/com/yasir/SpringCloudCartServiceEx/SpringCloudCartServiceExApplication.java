package com.yasir.SpringCloudCartServiceEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope   //for actuator to refresh remote server configurations
public class SpringCloudCartServiceExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCartServiceExApplication.class, args);
	}

}
