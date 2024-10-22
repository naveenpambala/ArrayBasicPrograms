package com.naveen.array;

import java.util.Iterator;

public class FindTheIndexDifferenceBetweenSmallestAndLargestElements {

	public static void main(String[] args) {
 
		int[] arr = {5, 7, 3, 8, 6, 9, 4};
		
		int small=arr[0];
		int big =arr[0];
		int smallIndex=0;
		int bigIndex=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(small> arr[i]) {
				small=arr[i];
				smallIndex=i; //index value saved here
			
			}else if(big<arr[i]) {
				big = arr[i];
				bigIndex =i;
				
			}
			
		}
		System.out.println(smallIndex+"-"+bigIndex+"="+(bigIndex-smallIndex));
	
	}

}
