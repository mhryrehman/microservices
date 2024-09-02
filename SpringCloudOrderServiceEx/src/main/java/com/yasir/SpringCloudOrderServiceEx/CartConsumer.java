package com.yasir.SpringCloudOrderServiceEx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CartConsumer {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	public String getCartDataLoadBalancerClient() {
		
		ServiceInstance info = loadBalancerClient.choose("CART-SERVICE");
		System.out.println("InstanceInfo is " + info);
		System.out.println("url is " + info.getUri());

		String url = info.getUri() + "/cart/message";
		System.out.println("going to call cart service with url : " + url);

		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		return response.getBody();
		
	}
	public String getCartDataDiscoveryClient() {
		
		List<ServiceInstance> list = discoveryClient.getInstances("CART-SERVICE");
		ServiceInstance info = list.get(0);
		System.out.println("InstanceInfo is " + info);
		System.out.println("url is " + info.getUri());

		String url = info.getUri() + "/cart/message";
		System.out.println("going to call cart service with url : " + url);

		RestTemplate template = new RestTemplate();
		ResponseEntity<String> response = template.getForEntity(url, String.class);
		
		return response.getBody();
		
	}
}
