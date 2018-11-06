package com.java8;

interface I {

	public void m1();

	public void m2();

	default void m3() {

	}

}

public class Test1 implements I {

	@Override
	public void m1() {

	}

	@Override
	public void m2() {

	}

}
