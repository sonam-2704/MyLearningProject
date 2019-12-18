package com.java;


/**
 * 
 * @author Sonam_Mittal
 *
 * Program to check number is even or odd by using division "/" operator
 */

public class EvenorOdd2 {

	public static void main(String[] args) {

		int number = 13;

		if ((number / 2) * 2 == number) {
			System.out.println(+number + " is Even number");
		} else {
			System.out.println(+number + " is Odd Number");
		}
	}

}
