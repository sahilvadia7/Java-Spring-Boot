package com.springboot.servlet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/greet")
	public String Greeting() {
		return "Hello World";	
	}
	
}
