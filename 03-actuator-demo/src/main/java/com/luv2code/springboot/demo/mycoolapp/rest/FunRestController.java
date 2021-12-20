package com.luv2code.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	@GetMapping("/")
	public String sayHello() {
		
		return "Hellow World, Local Time is "+LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyworkout() {
		
		return "Run a hard 5k!";
	}
	
}
