package com.java;

public class FactiorialProgram {

	public static void main(String args[]) {

		int n = 5;
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + n + " is " + fact);

		// using recursion

		System.out.println("Factorial of a number 6 is: " + findFactorial(6));

	}

	public static int findFactorial(int n) {

		if (n == 0)
			return 1;

		else
			return n * findFactorial(n - 1);

	}
}