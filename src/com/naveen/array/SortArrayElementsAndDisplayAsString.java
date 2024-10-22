package com.naveen.array;

import java.util.Arrays;

public class SortArrayElementsAndDisplayAsString {

	public static void main(String[] args) {

		int[] arr = { 5, 2, 3, 8, 1, 4, 6, 7, 9 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {

					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];

				}
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}
