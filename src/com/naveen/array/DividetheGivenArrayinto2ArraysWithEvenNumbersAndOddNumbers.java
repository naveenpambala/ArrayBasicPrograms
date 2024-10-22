package com.naveen.array;

public class DividetheGivenArrayinto2ArraysWithEvenNumbersAndOddNumbers {

	public static void main(String[] args) {
		 
		int[] arr = { 5, 2, 3, 8, 1, 4, 6, 7, 9 };
		
		int count=0;
		
		 for (int i = 0; i < arr.length; i++) {
			 if(arr[i]%2==0) {
				 count++;
				 
			 }
			
		}
		 int [] evenNum=new int[count];
		 int [] oddNum=new int[arr.length-count];
		 int x=0;
		 int y=0;
		 for (int i = 0; i < arr.length; i++) {
			 if(arr[i]%2==0) {
				 evenNum[x]=arr[i];
				 x++;
			 }else {
				 oddNum[y]=arr[i];
				 y++;
			 }
			
		}
		 for (int  i = 0; i < evenNum.length; i++) {
			 System.out.print(evenNum[i]);
			
		}
		 for (int i = 0; i < evenNum.length; i++) {
			 System.out.println(oddNum[i]);
			
		}
		 

	}

}
