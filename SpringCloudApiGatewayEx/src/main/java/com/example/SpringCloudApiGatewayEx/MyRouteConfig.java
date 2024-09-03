package com.example.SpringCloudApiGatewayEx;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRouteConfig {
	//If we have large number of microservices then we can define routes configuration here instead of application.yml file
	@Bean
	public RouteLocator configureRoutes(RouteLocatorBuilder builder) {
		return builder
				.routes()
				.route("cartServiceApp",
						r -> r.path("/cart/**")
						.uri("lb://CART-SERVICE")
						)
				.route("orderServiceApp",
						r -> r.path("/order/**")
						.filters(f -> f.addRequestHeader("Authorization", "JWT token has been added.")   //add header before sending request to /order/**
								.addResponseHeader("PaymentService", "response header is payment service"))
						.uri("lb://ORDER-SERVICE")
						)
				.build();
	}

}
