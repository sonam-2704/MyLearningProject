package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PrimeNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrime(10));
		
		List<Integer> primeList = Arrays.asList(3,5,7,8,9,56,57);
		
		//read last 3 elements of list
		List<Integer> tail = primeList.subList(Math.max(primeList.size() - 3, 0), primeList.size());

		System.out.println("tail: "+tail);
		
		tail.stream().forEach(System.out::println);
		
		primeList.stream().filter(PrimeNumberDemo::isPrime).forEach(System.out::println);
		primeList.stream().filter(PrimeNumberDemo::isPrime).collect(Collectors.toList());
		
		//List<Integer>list = IntStream.range(1, 45).filter(PrimeNumberDemo::isPrime).collect(Collectors.toList());
		IntStream x = IntStream.range(1, 45).filter(PrimeNumberDemo::isPrime);
		List<Integer>list = IntStream.range(1, 45).filter(PrimeNumberDemo::isPrime).boxed().collect(Collectors.toList());
		
		System.out.println(list);
		//Stream.iterate(1, n->n+1).limit(100).filter(PrimeNumberDemo::isPrime).forEach(System.out::println);
		//Stream.iterate(1, n->n+1).limit(100).filter(PrimeNumberDemo::isPrime).collect(Collectors.toList());
		
		
	}

	public static boolean isPrime(int number){
		
		//IntStream.rangeClosed(2,number/2).forEach(System.out::println);
		
		boolean x = IntStream.rangeClosed(2,number/2).noneMatch(i->number%i==0);
		
		return x;
	}
}
