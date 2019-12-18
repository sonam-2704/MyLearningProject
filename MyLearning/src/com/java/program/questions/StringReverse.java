package com.java.program.questions;

public class StringReverse {

	public static void main(String[] args) {

		String original = "JAVA";
		
		String reverse = "";
		
		for(int i=original.length()-1;i>=0;i--){
			
			reverse = reverse+original.charAt(i);
			
		}
		
		System.out.println("Original String : "+original);
		System.out.println("Reverse String : "+reverse);
		
	}

}
