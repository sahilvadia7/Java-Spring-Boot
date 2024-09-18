package com.springboot.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mysql.model.Employee;
import com.springboot.mysql.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	private EmployeeService empservice;

	public EmployeeService getEmpservice() {
		return empservice;
	}

	@Autowired
	public void setEmpservice(EmployeeService empservice) {
		this.empservice = empservice;
	}

	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return empservice.CreateEmp(employee);
	}
	
	@GetMapping("/getAll")	
	public List<Employee> getAllEmp(){
		return empservice.getAllEmp();
	}
	
	@GetMapping("/findByid/{id}")
	public Employee findByid(@PathVariable Long id) {
		return empservice.FindByid(id);
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id,
			@RequestBody Employee emp) {
		return empservice.updateEmp(emp, id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable Long id) {
		empservice.deleteEmp(id);
		return new ResponseEntity<String>("Employee deleted",HttpStatus.OK);
	}

}
