package com.springboot.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlSpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlSpringbootWebApplication.class, args);
		System.out.println("Hello");
	}

}
