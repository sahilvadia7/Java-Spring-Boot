package com.example.springfirst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springfirst.model.Customer;
import com.example.springfirst.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerrepo;
//	List<Customer> customers = new ArrayList<>();
	
	public void addCustomer(Customer customer) {
//		customers.add(customer);		
//		System.out.println("Customer Added");
		customerrepo.save(customer);
	}
	
//	public List<Customer> getAllCustomer(){
//		return customers;
//	}
}
