package com.java;

public class PalindromeStringDemo {

	public static void main(String[] args) {

		String original = "abcd";
		
		String rev = "";
		
		int length = original.length();
		
		for(int i= length-1; i>=0; i--){
			
			rev = rev+original.charAt(i);
			
		}
		
		System.out.println("Reverse: "+rev);
		
		if(original.equals(rev)){
			
			System.out.println("Strings are equal");
		}
	}

}
