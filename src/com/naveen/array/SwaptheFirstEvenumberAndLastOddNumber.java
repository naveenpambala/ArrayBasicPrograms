package com.naveen.array;

public class SwaptheFirstEvenumberAndLastOddNumber {

	public static void main(String[] args) {
		 
		int[] arr = { 4, 2, 8, 9, 1, 6, 7, 4 };
		int firstEvenIndex=-1;
		int lastOddIndex=-1;
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				firstEvenIndex=i;
				break;
				
			}			
		}
		for (int j = arr.length-1; j >=1; j--) {
			if(arr[j]%2!=0) {
				lastOddIndex= j ;
				break;
			}
			
			
		}
		
		if(firstEvenIndex!= -1 && lastOddIndex!=-1 ) {
			temp=arr[firstEvenIndex];
			arr[firstEvenIndex]=arr[lastOddIndex];
			arr[lastOddIndex]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			 
				System.out.print(arr[i]+" ");
			
			
		}
		
//		OR
		
//		int i, j;
//		for (i=0 ; i<arr.length ; i++){
//		if(arr[i]%2==0)
//		break;
//		}
//		for (j=arr.length-1 ; j>=0 ; j--){
//		if(arr[j]%2!=0)
//		break;
//		}
//		int temp=arr[i];
//		arr[i]=arr[j];
//		arr[j]=temp;
//		System.out.println("Array after swap : ");
//		for (i=0 ; i<arr.length ; i++){
//		System.out.println(arr[i]);
//		}

		
		
		

	}

}
