package com.naveen.array;

public class FindTheCommonElementsFrom2Arrays {

	public static void main(String[] args) {
		 
		int[] a1 = {6, 3, 9, 1, 2, 8, 4, 5};
		int[] a2 = {10, 3, 9, 30, 2, 8, 4, 50};
		
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a1[i] == a2[j]) {
					System.out.println(a1[i]);
					a2[j]=0;
				}
				
			}
		}
	}

}
