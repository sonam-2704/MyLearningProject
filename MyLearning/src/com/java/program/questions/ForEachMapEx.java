package com.java.program.questions;

import java.util.HashMap;
import java.util.Map;

public class ForEachMapEx {

	public static void main(String a[]) {

		Map<String, String> countryMap = new HashMap<>();
		countryMap.put("India", "Delhi");
		countryMap.put("USA", "Washington, D.C.");
		countryMap.put("Japan", "Tokyo");
		countryMap.put("Canada", "Ottawa");

		// iterate through Map normal way
		ForEachMapEx.iterateMap(countryMap);

		// iterate through Map using forEach method
		ForEachMapEx.iterateMapUsingForEach(countryMap);
	}

	public static void iterateMap(Map<String, String> countryMap) {

		System.out.println("<----------Iterating in normal way------------->");
		for (Map.Entry<String, String> entry : countryMap.entrySet()) {
			System.out.println("Country: " + entry.getKey() + " : Capital: " + entry.getValue());
		}
	}

	public static void iterateMapUsingForEach(Map<String, String> countryMap) {

		System.out.println("\n<----------Iterating using forEach method------------>");
		countryMap.forEach((k, v) -> System.out.println("Country: " + k + " : Capital: " + v));

		countryMap.forEach((k, v) -> {
			// you can implement some business logic here..

		});
	}

}
