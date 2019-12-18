package com.java;

public class RemoveVowels {

	public static void main(String[] args) {

		String str = "RemoveVowels";
		String resultStr = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println("String after removing vowels: " + resultStr);
	}
}
