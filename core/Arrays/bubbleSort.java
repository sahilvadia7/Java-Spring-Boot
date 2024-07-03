package core.Arrays;

import java.util.Scanner;

public class bubbleSort {

	static int[] nums=new int[10];
	static int temp,userin;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter length of Array : ");
		userin = sc.nextInt();
		
		for(int i=0; i<userin; i++) {
			System.out.print("Enter value of  "+i+" th index : ");
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting");
		for(int i=0; i<userin; i++) {
			System.out.print(nums[i]+" ");
		
		}
		bubblesort();
		System.out.println("\nAfter sorting");		
		for(int i=0; i<userin; i++) {
			System.out.print(nums[i]+" ");
		
		}
		
		
		
		
	}

	private static void bubblesort() {
		// TODO Auto-generated method stub

//		5,3,1,2,4
		for(int i=0; i<userin; i++) {
			
			for(int j=userin-1; j>=i; j--) {
				if(nums[i]>nums[j]) {
					temp = nums[i];
					nums[i]= nums[j];
					nums[j]=temp;
				}
			}
			
		}
		
	}

}
