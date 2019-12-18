package com.java;

import java.util.Scanner;

public class DecimalFromBinary {

	/**
	 * www.instanceofjava.com
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a binary number: ");

		// int binarynum =in.nextInt();
		int binarynum = 101;
		int binary = binarynum;

		int decimal = 0;
		int power = 0;

		while (true) {

			if (binary == 0) {

				break;

			} else {

				int tmp = binary % 10;
				decimal += tmp * Math.pow(2, power);
				binary = binary / 10;
				power++;

			}
		}
		System.out.println("Binary=" + binary + " Decimal=" + decimal);

		String binaryString = "101";

		int binaryNumber = Integer.parseInt(binaryString, 2);
		System.out.println("Binary number is :" + binaryNumber);
	}

}
