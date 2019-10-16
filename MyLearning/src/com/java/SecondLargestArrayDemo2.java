package com.java;

public class SecondLargestArrayDemo2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 3, 7, 67, 34, 9 };

		int highest = Integer.MIN_VALUE;
		int second_highest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (highest < arr[i]) {

				second_highest = highest;
				highest = arr[i];

			}

			if (arr[i] != highest && second_highest < arr[i]) {

				second_highest = arr[i];
			}
		}

		if (second_highest == Integer.MIN_VALUE) {
			System.out.println("Second largest number does not exist");
		} else {
			System.out.println("Second latrgest number is: " + second_highest);
		}
	}
}
