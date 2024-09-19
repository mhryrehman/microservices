package com.example.SpringCloudBServiceEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppBRestController {
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showB")
	public String gotoServiceB() {
		System.out.println("From B service");
		String body = rt.getForObject("http://localhost:8083/showC", String.class);
		System.out.println("Back to B Service");
		return "From B => " + body;
	}

}
