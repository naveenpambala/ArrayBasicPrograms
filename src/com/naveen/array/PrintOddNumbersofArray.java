package com.naveen.array;

public class PrintOddNumbersofArray {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 8, 9, 1, 6, 7, 5 };

		for (int i=0; i<arr.length; i++) {
			if (arr[i] % 2 == 1) {

				System.out.print(arr[i] + " ");
			}
		}

	}

}
