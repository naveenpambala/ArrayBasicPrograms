package com.naveen.array;

public class PrintEvenNumbersofArray {

	public static void main(String[] args) {
		 
		int[] arr = {4, 2, 8, 9, 1, 6, 7, 5};
		
		for(int x:arr) {
			if(x%2 == 0) {
				
				System.out.print(x+" ");
			}
		}

	}

}
