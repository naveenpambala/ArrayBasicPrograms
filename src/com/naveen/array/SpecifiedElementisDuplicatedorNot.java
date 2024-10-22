package com.naveen.array;

import java.util.Scanner;

public class SpecifiedElementisDuplicatedorNot {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int[] arr = { 4, 2, 8, 9, 1, 6, 7, 4 };
		
		System.out.println("Enter Element");
		
		int ele = sc.nextInt();
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == ele) {
				count++;
			}
			
		}
		
		if(count == 0) {
			 System.out.println("Element is Not found");
			 
		} else if(count == 1) {
			System.out.println("Element is Not duplicate");
			
		}else {
			System.out.println("Element is duplicate");	
		}
		
		
		
		
		

	}

}
