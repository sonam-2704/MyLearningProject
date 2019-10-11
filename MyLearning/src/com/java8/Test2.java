package com.java8;

interface Interf2{
	
	public static void m1(){
		
		System.out.println("Interface static method");
	}
	
}

public class Test2 implements Interf2 {

	public static void main(String[] args) {

		Test2 test = new Test2();
		
		//Test2.m1();
		
	}

}
