package com.yasir.SpringCloudCartServiceEx;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Value("${server.port}")
	private String port;
	
	@Value("${my.app.title}")
	private String title;
	
	@GetMapping("/message")
	public String getCardData() {
		return "this is cart service with port : " + port + " and title : " + title;
	}
	
	@GetMapping("/model/{code}")
	public ResponseEntity<CartInfo> getCartInfo(@PathVariable String code) {
		return ResponseEntity.ok(new CartInfo(code,"12345"));
	}

}
