package oops;

import java.util.Scanner;

class inheri{
	static String name;
	
	inheri(String name){
		inheri.name = name;
	}
	
	void PrintD(String name) {
		System.out.print("Name is : "+name);
	}
}
public class Inheritancee extends inheri {

	Inheritancee(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		inheri in = new inheri(name);
		try (Scanner se = new Scanner(System.in)) {
			System.out.print("Enter your name: ");
			name = se.next();
		}
		in.PrintD(name);
		
	}
}
