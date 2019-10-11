package com.java;

public class SecondLargestArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 5, 3, 7, 67, 34, 9 };
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>largest){
				
				secondLargest = largest;
				largest = arr[i];
				
			}
			
			if(arr[i]!=largest && arr[i]>secondLargest){
				
				secondLargest=arr[i];
			}
		}
		
		if(secondLargest == Integer.MIN_VALUE){
			System.out.println("Second largest number does not exist");
		}
		else{
			System.out.println("Second latrgest number is: "+secondLargest);
		}
	}
}
