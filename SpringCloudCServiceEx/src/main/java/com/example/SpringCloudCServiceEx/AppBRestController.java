package com.example.SpringCloudCServiceEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AppBRestController {
	
	@Autowired
	private RestTemplate rt;
	
	@GetMapping("/showC")
	public String gotoServiceB() {
		System.out.println("From C service");
		return "From C ";
	}

}
