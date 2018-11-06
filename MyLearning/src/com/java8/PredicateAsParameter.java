package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateAsParameter {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(-1, 3, 6, 7, 34, 65, -90, -34);

		getFilteredList(list1, i -> i > 10);
		System.out.println("================");
		getFilteredList(list1, i -> i == 0);
		System.out.println("================");
		getFilteredList(list1, i -> i > 0);
		System.out.println("================");
		getFilteredList(list1, i -> i % 2 == 0);
		System.out.println("================");
		getFilteredList(list1, i -> i % 2 == 0, i -> i > 0);
	}

	public static void getFilteredList(List<Integer> list, Predicate<Integer> p) {

		for (Integer i : list) {

			if (p.test(i)) {

				System.out.println(i);
			}
		}
	}

	public static void getFilteredList(List<Integer> list, Predicate<Integer> p1, Predicate<Integer> p2) {

		for (Integer i : list) {

			if (p1.and(p2).test(i)) {

				System.out.println(i);
			}
		}

	}

}
