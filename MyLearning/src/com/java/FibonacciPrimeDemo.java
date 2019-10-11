package com.java;

import java.util.ArrayList;
import java.util.List;

public class FibonacciPrimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> fibonacciList = createFibonacci();
		System.out.println("fibonacciList : "+fibonacciList);
		checkPrime(fibonacciList);
	}

	public static void checkPrime(List<Integer> list) {

		List<Integer> primeList = new ArrayList<Integer>();
		
		int number = 7;
		boolean flag = false;
		
		for(Integer num: list){
		
			flag = false;
			for (int i = 2; i <= num / 2; i++) {

				if (num==0 || num == 1)
					break;
				if (num % i == 0) {

					System.out.println("number is not prime: "+num);
					flag = true;
					break;
				}
			}
			if(flag==false){
				
				primeList.add(num);
				System.out.println("number is prime: "+num);
			}
		}
		
	}

	public static List<Integer> createFibonacci() {

		List<Integer> list = new ArrayList<Integer>();
		int firstNum = 0;
		int secondNum = 1;
		int nextNum = 0;

		list.add(firstNum);
		list.add(secondNum);

		for (int i = 1; i <= 100; i++) {

			nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;

			if (nextNum >= 100)
				break;

			list.add(nextNum);
		}

		System.out.println(list);

		return list;
	}

}
