package com.java;

import java.util.Arrays;

/**
 * 
 * 
 * @author Sonam_Mittal
 *
 *
 * Sort String using String Methods
 */



public class SortString {

	public static void main(String[] args) {

		String original  = "edcba";
		
		char[] charArray = original.toCharArray();
		
		Arrays.sort(charArray);
		
		String sorted = new String(charArray);
		
		System.out.println("Sorted String: "+sorted);
	}

}
