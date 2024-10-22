package com.naveen.array;

public class FirstElementofArrayisEvenorNot {

	public static void main(String[] args) {
		 
		int[] arr = {4, 2, 8, 9, 1, 6, 7, 5};
		
		int firstele= arr[0];
		if(firstele%2 == 0) {
			System.out.println(firstele +" is Even");
		}else {
			System.out.println(firstele +" is Not Even");
		}

	}

}
