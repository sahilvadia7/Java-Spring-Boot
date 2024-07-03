package core.Arrays;

import java.util.Scanner;

public class twoDArray {
	
	static int[][] nums=new int[10][10];
	static int temp,row,col;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) { 
		System.out.print("Enter how many row need: ");
		row = sc.nextInt();
		
		System.out.print("Enter how many colum need: ");
		col= sc.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			       System.out.print("Enter element " + (i + 1) + "th element " + (j + 1) + "th element: ");
	                nums[i][j] = sc.nextInt();		
			}
		
		}
		
		
		System.out.print("Enter element you want to search: ");
		temp = sc.nextInt();
		
		
		
		System.out.println("\n2D Array");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			       System.out.print(nums[i][j]);	
			}
			System.out.println();
		
		}
		
		
		int[] index =SearchElement(nums,temp);
		System.out.print("Your element index is :");
		
		int a=0;
		while(a<index.length) {
			System.out.print(index[a]+" ");
			a++;
		}
		
		
	}

	private static int[] SearchElement(int[][] nums2, int temp2) {
		// TODO Auto-generated method stub
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			     if(nums[i][j]==temp) {
			    	 return new int[] {i,j};
			     }
			}
			System.out.println();
		
		}
		return null;
	}
}
