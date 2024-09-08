package oops;

import java.util.*;
public class ExceptionHandling {

	static int num;
	
	
	ExceptionHandling(int num){
		ExceptionHandling.num = num;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your num : ");
		try {
			num = sc.nextInt();
			sc.close();
		} catch (Exception e) {
			throw new ArithmeticException("Only number allowed");
		}finally {
		      System.out.println("The 'try catch' is finished.");
	    }
		

		
	}

}
