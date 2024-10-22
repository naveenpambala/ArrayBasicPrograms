package com.naveen.array;

public class SumofarrayElements {

	public static void main(String[] args) {
		 
		int[] arr = {4, 2, 8, 9, 1, 6, 7, 5};
		
		int sum=0;
		
		 for(int i=0; i< arr.length; i++) {
			 
			 sum=sum+arr[i];
		 }
		 System.out.println("SumofarrayElements "+ sum);
	}

}
