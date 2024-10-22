package com.naveen.array;

public class DisplayElementUsingForEachLoop {

	public static void main(String[] args) {
		 
//		=> It is called Enhanced for loop in Java
//		=> For-each loop is used to process Array or Collection elements easily.
//		=> For-each loop process elements from start to end without using index.
//		=> For-each loop process elements only in forward direction.
		int[] arr = {4, 2, 8, 9, 1, 6, 7, 5};
		
		for(int x :arr) {
			System.out.print(x+" ");
		}

		
	}

}
