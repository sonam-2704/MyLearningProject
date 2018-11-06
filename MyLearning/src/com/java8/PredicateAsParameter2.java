package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee1 {

	String ename;
	int eno;

	public Employee1(String ename, int eno) {

		this.ename = ename;
		this.eno = eno;
	}

}

public class PredicateAsParameter2 {

	public static void main(String[] args) {

		List<Employee1> empList = new ArrayList<Employee1>();

		empList.add(new Employee1("Anil", 10));
		empList.add(new Employee1("Sunil", 15));
		empList.add(new Employee1("Ramesh", 45));
		empList.add(new Employee1("Suresh", 5));
		empList.add(new Employee1("Sanjay", 100));

		filteredEmployee(empList, e -> e.ename.contains("nil"));
		System.out.println("================");
		filteredEmployee(empList, e -> e.ename.length() > 4);
		System.out.println("================");
		filteredEmployee(empList, e -> e.eno > 50);

	}

	public static void filteredEmployee(List<Employee1> list, Predicate<Employee1> p) {

		for (Employee1 e : list) {

			if (p.test(e)) {

				System.out.println(e.ename + " : " + e.eno);
			}
		}

	}

}
