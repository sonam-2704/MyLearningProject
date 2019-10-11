package com.java8;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.*;
public class StreamExample1 {

	public static void main(String[] args) {
		
		int x = IntStream.range(1, 10).sum();
		System.out.println(x);
		
		int y = IntStream.range(1, 10).skip(5).sum();
		System.out.println(y);
	
		IntStream z = IntStream.range(1, 10).skip(5);
		
		Stream.of("Amma","Edward","Christine").sorted().findFirst().ifPresent(System.out::println);;
		
		Stream<String> a = Stream.of("Amma","Edward","Christine").sorted();
		
		List<String> list = a.collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		List<String> list1 = Stream.of("Amma","Edward","Christine").filter(s->s.length()>5).collect(Collectors.toList());
		 
		list1.forEach(System.out::println);
		
		int squareSum = IntStream.range(1, 10).map(i->i*i).sum();
		
		System.out.println(squareSum);
		
		long count = Stream.of("Amma","Edward","Christine").filter(s->s.length()>5).count();
		
		System.out.println(count);
		
		Map<String, Integer> map = Stream.of("Amma","Edward","Christine").sorted().collect(Collectors.toMap(s->s, s->s.length()));
		System.out.println(map);
	}

}
