package com.naveen.array;

public class SumofEvenNumbersintheArray {

	public static void main(String[] args) {
		
		int[] arr = { 4, 2, 8, 9, 1, 6, 7, 5 };
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				
				sum=sum+arr[i];
				
				
			}
		}
		System.out.println("SumofEvenNum "+sum);

	}

}
