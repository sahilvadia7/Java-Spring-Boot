package oops;

import java.util.*;
public class ExceptionHandling {

	static int num;
	
	
	ExceptionHandling(int num){
		this.num = num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your num : ");
		try {
			num = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ArithmeticException("Only number allowed");
		}finally {
		      System.out.println("The 'try catch' is finished.");
	    }
		

		
	}

}
