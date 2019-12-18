package com.java.program.questions;

public class NumberReverseRecursion {

	int rev = 0;

	public static void main(String a[]) {

		NumberReverseRecursion nr = new NumberReverseRecursion();
		System.out.println("Reverse of a number is : " + nr.reverseRecursive(123456));

	}

	public int reverseRecursive(int n) {

		if (n != 0) {

			rev = rev * 10 + n % 10;
			n = n / 10;
			reverseRecursive(n);

		}

		return rev;
	}

}
