package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

	String name;
	int eno;

	public Employee(String name, int eno) {

		this.name = name;
		this.eno = eno;

	}
	
	@Override
	public String toString(){
		
		return name+" : "+eno;
	}
}

public class LambdaDemo5 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Angel", 145));
		list.add(new Employee("Tanishka", 111));
		list.add(new Employee("Aarav", 112));
		list.add(new Employee("Sunny", 123));

		System.out.println(list);
		
		Comparator<Employee> c = (e1, e2) -> (e1.eno < e2.eno) ? -1 : (e1.eno > e2.eno) ? 1 : 0;

		Collections.sort(list, c);

		System.out.println(list);
		
		Comparator<Employee> c1 = (e1, e2) ->e1.name.compareTo(e2.name);

		Collections.sort(list, c1);
		
		list.forEach(System.out::println);

	}

}
