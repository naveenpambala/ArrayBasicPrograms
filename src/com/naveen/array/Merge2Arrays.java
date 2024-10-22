package com.naveen.array;

public class Merge2Arrays {

	public static void main(String[] args) {

		int[] a1 = { 10, 20, 30, 40 };

		int[] a2 = { 50, 60, 70 };

		int[] a1a2 = new int[a1.length + a2.length];

		for (int i = 0; i < a1.length; i++) {
			a1a2[i] = a1[i];

		}
		for (int i = 0; i < a2.length; i++) {

			a1a2[a1.length + i] = a2[i];

		}
		for (int j = 0; j < a1a2.length; j++) {
			System.out.print(a1a2[j]);

		}

	}

}
