package com.java;

/**
 * 
 * @author Sonam_Mittal
 *
 * Program to check number is even or odd by using "&" operator
 */

public class EvenorOdd3 {

	public static void main(String[] args) {

		int number = 34;

		if ((number & 1) == 0) {
			System.out.println(+number + " is Even number");
		} else {
			System.out.println(+number + " is Odd Number");
		}

	}

}
