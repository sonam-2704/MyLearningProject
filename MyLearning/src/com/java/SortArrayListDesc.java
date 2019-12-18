package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class SortArrayListDesc {

	public static void main(String[] args) {

		// create an ArrayList object
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// Add elements to Arraylist
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);

		System.out.println("Before sorting: " + arrayList);
		
		/*
		 * Use static Comparator reverseOrder() method of Collections utility
		 * class to get comparator object
		 */

		Comparator<Integer> objComparator = Collections.reverseOrder();

		/*
		 * use static void sort(List list, Comparator com) method of Collections
		 * class.
		 */
		Collections.sort(arrayList, objComparator);

		System.out.println("After sorting in reverse order: " + arrayList);


	}

}
