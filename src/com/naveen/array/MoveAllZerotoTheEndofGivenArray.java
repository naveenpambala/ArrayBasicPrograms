package com.naveen.array;

public class MoveAllZerotoTheEndofGivenArray {

	public static void main(String[] args) {
		 
		int[] arr = {9, 0, 0, 4, 0, 3, 0, 2, 0};
		
		int zero[]=new int[arr.length];
		
		int left=0;
		int right =arr.length-1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				zero[right--]=arr[i];
				
			}else {
				zero[left++]=arr[i];
			}
			
		}
		 for (int i : zero) {
			 System.out.println(i);
			
		}
	}

}
