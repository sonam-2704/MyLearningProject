package com.java;

public class PalindromeNumberDemo {

	public static void main(String[] args) {

		int number= 121;
		
		int temp = number;
		int rev = 0;
		int rem= 0;
		while(temp!=0){
			
			
			rem= temp%10;
			rev= rev *10+rem;
			temp = temp/10;
		}
		
		System.out.println(rev);
		
		if(rev==number){
			System.out.println("Number is palindrome");
		}
	}

}
