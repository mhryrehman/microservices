package com.example.SpringBootKafkaIntegrationEx.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fhir")

public class HapiController {

	@GetMapping("/")
	public String getUser() {
		return "this is hapi";
	}
	
	@GetMapping("/login")
	public String login() {
		return "this is login";
	}
	
	@GetMapping("/protected")
	public String protectedEnd(@RequestParam String scope) {
		return "this is protected endpoint with scope : " + scope;
	}
}
