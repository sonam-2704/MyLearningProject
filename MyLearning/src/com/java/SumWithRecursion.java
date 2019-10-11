package com.java;

public class SumWithRecursion {

	
	public int sumOfDigits(int n){
		
		if(n==0)
		return 0;
		
		return (n%10+sumOfDigits(n/10));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SumWithRecursion obj = new SumWithRecursion();
		int out = obj.sumOfDigits(12345);
		System.out.println(out);
		
	}

}
