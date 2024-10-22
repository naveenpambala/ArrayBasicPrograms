package com.naveen.array;

public class DisplayPairofElementsinArrayWhoseSumEqualsto10 {

	public static void main(String[] args) {
		 
		int[] arr = {6, 3, 9, 1, 2, 8, 4, 5};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]+arr[j] == 10) {
					
					System.out.println("("+arr[i]+","+arr[j]+")");
					
				}
			}
			
		}
	 
				

	}

}
