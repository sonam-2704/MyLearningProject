package com.java8;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Date>s = ()->new Date();
		
		System.out.println(s.get());
		
		Supplier<Date>s1 = ()-> {return new Date();};
		
		System.out.println(s1.get());
	}

}
