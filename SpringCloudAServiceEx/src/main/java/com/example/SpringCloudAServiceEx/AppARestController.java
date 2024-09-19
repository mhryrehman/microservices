package com.example.SpringCloudAServiceEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppARestController {
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showA")
	public String gotoServiceB() {
		System.out.println("From A service");
		String body = rt.getForObject("http://localhost:8082/showB", String.class);
		System.out.println("Back to A Service");
		return "From A => " + body;
	}

}
