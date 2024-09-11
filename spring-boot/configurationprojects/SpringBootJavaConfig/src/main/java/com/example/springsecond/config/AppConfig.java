package com.example.springsecond.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.springsecond.Student;
import com.example.springsecond.StudentService;

@Configuration
public class AppConfig {
	 
	@Bean
	@Scope("prototype")
	Student student() {
		return new Student();
	}
	
	@Bean
	StudentService studentservice() {
		return new StudentService();
	}
}
