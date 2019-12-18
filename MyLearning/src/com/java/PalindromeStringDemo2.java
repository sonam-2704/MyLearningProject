package com.java;

/**
 * @author Sonam_Mittal
 * String reverse using StringBuffer
 */
public class PalindromeStringDemo2 {

	public static void main(String[] args) {

		String original = "abcd";

		String reverse = "";

		StringBuffer sb = new StringBuffer(original);
		
		sb.reverse();
		
		reverse = sb.toString();
		
		System.out.println("Reverse: " + reverse);

		if (original.equals(reverse)) {

			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
	}

}
