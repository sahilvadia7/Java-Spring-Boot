package com.springboot.mysql.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.mysql.model.Employee;
import com.springboot.mysql.repository.EmployeeRepo;
import com.springboot.mysql.service.EmployeeService;

@Component
public class EmployeeServiceIMPL implements EmployeeService{

	private EmployeeRepo empReop;

	public EmployeeRepo getEmpReop() {
		return empReop;
	}

	@Autowired
	public void setEmpReop(EmployeeRepo empReop) {
		this.empReop = empReop;
	}

	@Override
	public Employee CreateEmp(Employee employee) {
		return empReop.save(employee);
	}

	@Override
	public List<Employee> getAllEmp() {
		return empReop.findAll();
	}

	@Override
	public Employee FindByid(Long id) {
		return empReop.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmp(Employee employee, Long id) {
		Employee oldemp = empReop.findById(id).orElse(null);
			oldemp.setId(employee.getId());
			oldemp.setName(employee.getName());
			oldemp.setSalary(employee.getSalary());
			oldemp.setEmail(employee.getEmail());
			empReop.save(oldemp);
			return oldemp;
	}

	@Override
	public void deleteEmp(Long id) {
		empReop.deleteById(id);
	}
	
	
	
	
}
