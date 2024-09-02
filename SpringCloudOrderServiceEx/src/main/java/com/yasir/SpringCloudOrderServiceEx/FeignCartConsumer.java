package com.yasir.SpringCloudOrderServiceEx;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//provide service id of producer service so details can be fetched from eureka server
@FeignClient("CART-SERVICE")
public interface FeignCartConsumer {

	//this method should match(returntype, parameter, httpmethod and path) with producer rest controller(Cart controller)
	@GetMapping("cart/message")
	public String getCardData();
	
	//CartInfo shoud be copied from producer(cart service) to consumer(order service)
	@GetMapping("cart/model/{code}")
	public ResponseEntity<CartInfo> getCartInfo(@PathVariable String code);

}
