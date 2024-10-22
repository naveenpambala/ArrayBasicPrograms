package com.naveen.array;

public class ReverseAllAlements {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 2, 1, 8, 4, 6 };

		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i]; // Store arr[i] in temp

			arr[i] = arr[j]; // Copy arr[j] to arr[i]

			arr[j] = temp; // Copy temp (original arr[i]) to arr[j]

			i++; // Move i to the right

			j--; // Move j to the left
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Explaination

//		Iteration 1 (i = 0, j = 6)
//		arr[i] = 5, arr[j] = 6
//		The elements at positions i and j are swapped: 
//		Copy code
//		temp = arr[0];  // temp = 5
//		arr[0] = arr[6];  // arr[0] becomes 6
//		arr[6] = temp;  // arr[6] becomes 5
//		The array now looks like:
//		arr = [6, 9, 2, 1, 8, 4, 5]
//		Increment i (i = 1) and decrement j (j = 5).

	}

}
