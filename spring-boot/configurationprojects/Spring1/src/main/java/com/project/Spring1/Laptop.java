package com.project.Spring1;

public class Laptop implements Computer {
	
	public Laptop() {
//		System.out.println("laptop obj created");
	}

	@Override
	public void vsCode() {
		System.out.println("Laptop vsCode");
	}
}
