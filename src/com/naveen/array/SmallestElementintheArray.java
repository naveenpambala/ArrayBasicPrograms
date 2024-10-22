package com.naveen.array;

public class SmallestElementintheArray {

	public static void main(String[] args) {
		  

		int[] arr = { 4, 2, 8, 9, 1, 6, 7, 5 };
		
		int firsEle=arr[0];
		int smallestele=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]<firsEle) {
				smallestele=arr[i];
			}
			
		}
		System.out.println("Smallest Element is "+smallestele);

		
	}

}
