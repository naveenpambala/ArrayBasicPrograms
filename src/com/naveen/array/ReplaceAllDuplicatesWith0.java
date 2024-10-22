package com.naveen.array;

import java.util.Arrays;

public class ReplaceAllDuplicatesWith0 {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2,6, 3, 4, 5, 9, 1, 2, 8, 4, 5, 6, 3, 9, 8,};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j] ) {
					arr[j]=0;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		 
		
	}

}
