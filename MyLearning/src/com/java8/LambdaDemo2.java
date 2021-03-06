package com.java8;

interface Interf1 {

	public void m1();
}

class MyClass implements Interf1 {

	public void m1() {

		System.out.println("Hello.. Lambda");
	}
}

public class LambdaDemo2 {

	public static void main(String[] args) {

		MyClass c = new MyClass();
		c.m1();
		Interf1 i2 = new Interf1() {

			@Override
			public void m1() {
				System.out.println("Hello.. Lambda2");
			}
		};

		i2.m1();
		Interf1 i = () -> System.out.println("Hello.. Lambda3");
		i.m1();
	}

}
