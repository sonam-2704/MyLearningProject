package com.java;

class Adder {
	/*static int add(int a, int b) {
		return a + b;
	}*/

	static long add(long a, long b) {
		return a + b;
	}
	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

class TestOverloading1 {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 83;
		
		System.out.println(Adder.add(n1, n2));
		System.out.println(Adder.add(11, 11));
		System.out.println(Adder.add(11, 11, 11));
	}
}
