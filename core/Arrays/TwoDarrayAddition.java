package core.Arrays;

import java.util.Scanner;

public class TwoDarrayAddition {
	
	 	static int[][] arr1 = new int[10][10];
	 	static int[][] arr2 = new int[10][10];
	 	static int row,col;
	    static Scanner sc = new Scanner(System.in);
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter how many row need: ");
		row = sc.nextInt();
		
		System.out.print("Enter how many colum need: ");
		col= sc.nextInt();
		
		System.out.println("\n Array1");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			       System.out.print("Enter element " + (i + 1) + "th element " + (j + 1) + "th element: ");
	                arr1[i][j] = sc.nextInt();		
			}
		
		}
		
		System.out.println("\n Array2 ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			       System.out.print("Enter element " + (i + 1) + "th element " + (j + 1) + "th element: ");
	                arr2[i][j] = sc.nextInt();		
			}
		
		}
		
		int[][] addition = additionArray(arr1,arr2);
		additionPrint(arr1,arr2,addition);
	}

	private static void additionPrint(int[][] arr1,int[][] arr2,int[][] addition) {
		// TODO Auto-generated method stub
		
		System.out.println("\n1st Array");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			      	System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n2nd Array");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			      	System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n Addition of both array");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			      	System.out.print(addition[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static int[][] additionArray(int[][] arr1,int[][] arr2) {
		// TODO Auto-generated method stub
		int[][] addition = new int [row][col];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
			     	addition[i][j] = arr1[i][j] + arr2[i][j];
			}
		
		}
		return addition;
		
	}

}
