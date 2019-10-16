package com.java;

import java.util.Arrays;
import java.util.StringJoiner;

public class AnagramStringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String str1 = "TRIANGLE";
		String str2 = "INTEGRAL";*/
		/*Integer i =10;
		 StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
*/         
		
		String str1 = "LISTEN";
		String str2 = "SILENT";
		System.out.println(anagramCheck(str1,str2));
		
	}
	
	public static boolean anagramCheck(String str1, String str2){
		
		char[] charArrayFromString1 = str1.toCharArray();
		char[] charArrayFromString2 = str2.toCharArray();
		
		
		Arrays.sort(charArrayFromString1);
		Arrays.sort(charArrayFromString2);
				
		
		return Arrays.equals(charArrayFromString1, charArrayFromString2);
	}

}
