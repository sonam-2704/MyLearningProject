package com.java;

import java.util.HashMap;
import java.lang.Object;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();

		int n = 153, sum = 0, temp, r;

		temp = n;
		while (temp != 0) {

			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;

		}

		if (n == sum)
			System.out.println(n + " is an Armstrong number.");
		else
			System.out.println(n + " is not an Armstrong number.");

	}

}
