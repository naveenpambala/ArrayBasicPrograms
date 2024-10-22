package com.naveen.array;

public class FindTheLargestDifferenceofArrayElements {

	public static void main(String[] args) {
		int[] arr = {5, 7, 3, 8, 6, 9, 4};
		
		int small=arr[0];
		int big = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			 if(small>arr[i]) {
				 small =arr[i];
			 }else if(big<arr[i]){
				 big=arr[i];
			 }
			
		}
		System.out.println(small+"-"+big+"="+(big-small));
	}

}
