package com.naveen.array;

public class PerfectNumbers {

	public static void main(String[] args) {
		
//		=> 6 is a perfect number because its divisors are 1, 2, and 3. If you add these divisors (1 + 2 + 3), you get 6.
//		=> 28 is also a perfect number because its divisors are 1, 2, 4, 7, and 14. When added (1 + 2 + 4 + 7 + 14), the sum is 28.
		 
		int[] arr = { 4, 2, 8, 9, 1, 6, 7, 4 };
		
		
				
		for (int i = 0; i < arr.length; i++) {
			
			int n= arr[i];
			int sum = 0;
			
			for (int j = 1; j < n; j++) {
				
				if(n%j == 0) {
					
					sum= sum+j;
					
				}
				
				
			}
			if(n == sum) {
				System.out.println(n+" Perfect Number");
			}
			
			
			
			
		}
		
		

	}

}
