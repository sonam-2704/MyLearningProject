package com.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		// find square of an integer
		Function<Integer,Integer> f = i->i*i;
		
		System.out.println("Square of 4 is: "+f.apply(4));
		System.out.println("Square of 5 is: "+f.apply(5));
		
		// find number is even or odd
		
		Predicate<Integer> p = i->i%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
	}

	public void m1(){
		
		
	}
}
