package com.java;

/**
 * 
 * @author Sonam_Mittal
 *
 * Program to check number is even or odd by using modulus "%" operator
 */


public class EvenorOdd1 {

	public static void main(String[] args) {

		int number=3;

		if ((number % 2) == 0) {
			System.out.println(+number + " is Even number");
		} else {
			System.out.println(+number + " is Odd Number");
		}

	}

}
