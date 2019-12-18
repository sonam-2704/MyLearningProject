package com.java;
public class SecondSmallestNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 3, 7, 67, 34, 9 };

		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < smallest) {

				second_smallest = smallest;
				smallest = arr[i];

			}

			if (arr[i] != smallest && arr[i] < second_smallest) {

				second_smallest = arr[i];
			}
		}

		System.out.println("Smallest number is: " + smallest);

		System.out.println("Second smallest number is: " + second_smallest);
	}

}
