package com.example.springfirst.repo;

import org.springframework.stereotype.Repository;

import com.example.springfirst.model.Customer;

@Repository
public class CustomerRepo {

	public void save(Customer customer) {
		System.out.println("data save into databse");
	}
}
