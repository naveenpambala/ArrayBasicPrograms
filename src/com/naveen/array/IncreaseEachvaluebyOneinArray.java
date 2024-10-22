package com.naveen.array;

public class IncreaseEachvaluebyOneinArray {

	public static void main(String[] args) {
	 
		int[] arr = {4, 2, 8, 9, 1, 6, 7, 5};

		for(int i=0;i< arr.length;i++) {
		 
			arr[i]++;
			
		}
		System.out.println("After Increase");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		
	}

}
