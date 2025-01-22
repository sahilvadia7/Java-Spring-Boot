package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class GreetController {

	@GetMapping("/hello")
	public String getMethodName() {
		return "Hello World";
	}
	
}
