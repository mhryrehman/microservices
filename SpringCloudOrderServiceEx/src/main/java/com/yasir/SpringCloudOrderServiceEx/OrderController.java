package com.yasir.SpringCloudOrderServiceEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	CartConsumer consumer;
	@Autowired
	FeignCartConsumer feignCartConsumer;
	
	//this will use loadBalancer client to get cart service data
	@GetMapping("/data")
	public ResponseEntity<String> getData(){
		return ResponseEntity.ok("From Order " + consumer.getCartDataLoadBalancerClient());
	}
	
	//this will use feing client to get cart data
	@GetMapping("/feigndata")
	public ResponseEntity<String> getFeignData(){
		return ResponseEntity.ok("From Order by using feign client" + feignCartConsumer.getCardData());
	}
	
	@GetMapping("/model")
	public ResponseEntity<String> getCartInfo(){
		return ResponseEntity.ok("From Order by using feign client" + feignCartConsumer.getCartInfo("yasir"));
	}

}
