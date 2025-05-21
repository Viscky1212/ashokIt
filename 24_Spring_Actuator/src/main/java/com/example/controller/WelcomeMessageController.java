package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessageController {

	@GetMapping("/message") 
	public String getGreatMessage() {
		return "Good Morning";
	}
	
	@GetMapping("/name") 
	public String nameWelcome() {
		return "Welcome in Spring boot";
	}
	
	
}
