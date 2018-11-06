package com.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo1 {

	public static void main(String[] args) {

		Function<Integer,Integer> f = i->i*i;

		System.out.println("Square of 4 is: "+f.apply(4));

		Predicate<Integer> p = i->i%2==0;

		System.out.println(p.test(4));

		Function<String,Integer> f2 = s->s.length();

		System.out.println("Length of string is: "+f2.apply("ssdd"));

		
	}

}
