package com.naveen.array;

public class PrintLeaderElementsInTheArray {

	public static void main(String[] args) {

//		A leader in an array is an element that is greater than all the elements to its right. 

		int[] array = { 16, 17, 4, 3, 5, 2 };

// Starting from the rightmost element
		int maxFromRight = array[array.length - 1];
		System.out.print("Leader elements: " + maxFromRight);

// Traverse the array from right to left
		for (int i = array.length - 2; i >= 0; i--) {
			if (array[i] > maxFromRight) {
				maxFromRight = array[i];
				System.out.print(" " + maxFromRight);
			}

		}
	}
}
