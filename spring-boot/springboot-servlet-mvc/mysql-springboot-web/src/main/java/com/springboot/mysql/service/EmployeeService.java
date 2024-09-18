package com.springboot.mysql.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.mysql.model.Employee;

@Service
public interface EmployeeService {
	
	//createEmp
	public Employee CreateEmp(Employee employee);
	
	//getEmp
	public List<Employee> getAllEmp();
	
	//findByid
	public Employee FindByid(Long id);

	//updateEmp
	public Employee updateEmp(Employee employee,Long id);
	
	//deleteEmp
	public void deleteEmp(Long id);
}
