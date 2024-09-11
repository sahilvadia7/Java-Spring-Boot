package com.example.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

import com.example.springfirst.model.Customer;
import com.example.springfirst.service.CustomerService;

// Annotation based Configuration

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);
		
//		Alien obj = context.getBean(Alien.class);
//		obj.code();
//		System.out.println(obj.getAge());
		
		Customer customer1 = context.getBean(Customer.class);
		customer1.setCustomerid(1);
		customer1.setCustomername("Sahil");
		customer1.setAddress("Ahmedabad");
		
		CustomerService cs = context.getBean(CustomerService.class);
		cs.addCustomer(customer1);
		
//		cs.getAllCustomer().forEach(customer -> System.out.println(customer.getCustomerid()+" "+customer.getCustomername()+" "+customer.getAddress()));
		
	}

}
