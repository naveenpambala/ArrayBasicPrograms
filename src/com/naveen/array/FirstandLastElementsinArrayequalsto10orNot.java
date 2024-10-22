package com.naveen.array;

public class FirstandLastElementsinArrayequalsto10orNot {

	public static void main(String[] args) {
		
		int[] arr = {4, 2, 8, 9, 1, 6, 7, 5};
		
		int firstEle= arr[0];
		int lastEle=arr[arr.length-1];
		
		if(firstEle+lastEle == 10) {
			System.out.println("Equal To 10");
		}else {
			System.out.println(" Not Equal To 10");
		}
		

	}

}
