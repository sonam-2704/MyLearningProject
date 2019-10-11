package com.java;

import java.util.Arrays;

public class SecondLargestArrayDemo1 {

	public static void main(String[] args) {

		int[] arr = {1,2,5,3,7,67,34,9};
		int len = arr.length;
		
		if(len<2){
			System.out.println("Second largest number does not exist");
		}
		Arrays.sort(arr);
		int secondLargest = arr[len-2];
		
		System.out.println(secondLargest);
	}

}
