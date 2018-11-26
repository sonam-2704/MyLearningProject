package com.epam.learning;

public class Test {

	public static void main(String[] args) {
		Integer i = new Integer(5); 
		  
        // Below line causes compile time error:- 
        // Incompatible conditional operand types 
        // Integer and String 
        //System.out.println(i instanceof String); 
	}

}
