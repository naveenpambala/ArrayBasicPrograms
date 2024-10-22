package com.naveen.array;

import java.util.Arrays;

public class ArrayWithOnlyEvenNumbers {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 3, 8, 1, 4, 6, 7, 9 };

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				count++;
			}

		}
		int[] even = new int[count];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[j] = arr[i];
				j++;
			}

		}
		for (j = 0; j < even.length; j++) {

//			System.out.print( Arrays.toString(even) + " ");
			System.out.print(even[j]+ " ");
		}

	}

}

//Explenation

//Given arr = { 5, 2, 3, 8, 1, 4, 6, 7, 9 }:
//
//After the first loop, count = 4 (since the even numbers are 2, 8, 4, 6).
//In the second loop:
//arr[1] = 2: even[0] = 2, j = 1
//arr[3] = 8: even[1] = 8, j = 2
//arr[5] = 4: even[2] = 4, j = 3
//arr[6] = 6: even[3] = 6, j = 4
//After the loop, the even array contains {2, 8, 4, 6} and j ensures each even number is placed in the correct position in the even array.
