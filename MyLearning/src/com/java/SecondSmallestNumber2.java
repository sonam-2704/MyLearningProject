package com.java;

import java.util.Arrays;

public class SecondSmallestNumber2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 3, 7, 67, 34, 9 };

		Arrays.sort(arr);

		System.out.println("Smallest Number: " + arr[0]);
		System.out.println("Second Smallest Number: " + arr[1]);

	}

}
