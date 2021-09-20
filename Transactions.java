package com.rahulawasthi.main;
import java.util.Scanner;

public class Transactions {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println( "Enter the Size of array" );
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println( "Enter the array" );
		
		for( int i = 0; i < size; i++ ) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println( "Enter the number of Target" );
		int numTargets = sc.nextInt();
		
		for( int i = 0; i <numTargets; i++) {
			System.out.println( "Enter the Target" );
			int target = sc.nextInt();
	
			int sum =0;
			for (int j=0; j<arr.length; j++ ) {
				sum = sum + arr[j];
				
				if (sum >=target) {
					System.out.println("Target is reached after " + (j+1) +"array");
						
				break;	
				}
				if (j==arr.length -1 && sum <target) {
					System.out.println("Target is not reached");
				}
			}
		
}
}
}