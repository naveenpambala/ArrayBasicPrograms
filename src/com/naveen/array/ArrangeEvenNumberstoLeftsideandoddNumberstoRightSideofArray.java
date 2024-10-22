package com.naveen.array;

public class ArrangeEvenNumberstoLeftsideandoddNumberstoRightSideofArray {

	public static void main(String[] args) {
 
		int[] arr = {7, 3, 9, 8, 4, 1, 2, 6, 5};
		
		int[] finalResult = new int[arr.length]; 
		int left=0;
		int right =arr.length-1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				finalResult[left++]=arr[i];
			}else {
				finalResult[right--]=arr[i];
			}
			
			
		}
		for(int x : finalResult) {
			System.out.print(x+" ");
		}
				
	}

}
