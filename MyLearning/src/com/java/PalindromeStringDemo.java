package com.java;


/**
 * @author Sonam_Mittal
 * String reverse using for loop
 */

public class PalindromeStringDemo {

	public static void main(String[] args) {

		String original = "abcd";

		String reverse = "";

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + original.charAt(i);

		}

		System.out.println("Reverse: " + reverse);

		if (original.equals(reverse)) {

			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
	}

}
