package com.project.Spring1;



public class Alien {
	
	private String name;
	private Computer laptop;
	
	
	public Alien() {
//		System.out.println("constuctor : in alien");
	}
	

	
	public Alien(String name,Computer laptop) {
		super();
//		System.out.println("para consturctor");
		this.name = name;
		this.laptop = laptop;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {

//		System.out.println("setter method : Setter injection");
		this.name = name;
	}
	
	public Computer getLaptop() {
		return laptop;
	}


	public void setLaptop(Computer laptop) {
		this.laptop = laptop;
	}


	public void code() {
		System.out.println("code method: Coding");
		laptop.vsCode();
	}

}
