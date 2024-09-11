package com.example.springfirst.model;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private int customerid;
	private String customername;
	private String address;
	
	
	
	public Customer() {
		super();
	}

	public Customer(int customerid, String customername, String address) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.address = address;
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
