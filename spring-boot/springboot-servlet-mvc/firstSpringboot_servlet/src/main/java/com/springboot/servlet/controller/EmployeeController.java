package com.springboot.servlet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.servlet.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/getemp")
	public Employee getEmployee() {
		return new Employee(101L,"sahil",34000.0,"sahil@gmail.com");
	}
	
	@GetMapping("/getAllemp")
	public List<Employee> getAllEmp(){
		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(1L,"sahil",34000.0,"sahil@gmail.com"));
		emplist.add(new Employee(2L,"nikhil",90000.0,"nikhil@gmail.com"));
		emplist.add(new Employee(3L,"aryan",134000.0,"Aryan@gmail.com"));
		emplist.add(new Employee(4L,"ankit",1134000.0,"ankityadav@gmail.com"));

		return emplist;
	}
}
