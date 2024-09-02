package com.yasir.SpringCloudEurekaServerEx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/message")
	public String getCardData() {
		return "this is cart service with port : " + port;
	}

}
