package com.example.OAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@GetMapping("/hello")
	public String sayHello() {
		return "hello from app";
	}
}
