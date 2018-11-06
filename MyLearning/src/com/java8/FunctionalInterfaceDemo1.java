package com.java8;

import java.util.function.Function;

public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {

		Function<Integer,String> f = i->String.valueOf(i);
		
		System.out.println(f.apply(66));
		
		String result = f.apply(55);
		
		System.out.println(result);
	}

}
