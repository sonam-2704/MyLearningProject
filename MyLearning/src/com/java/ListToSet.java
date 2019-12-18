package com.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListToSet {

	/**
	 * Description: Convert List to set in java with example program
	 */

	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Java");
		arrList.add("List to String");
		arrList.add("Example Program");
		Set<String> set = new HashSet<String>(arrList);

		System.out.println(set);

	}

}
