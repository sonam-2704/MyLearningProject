package com.java;

public class Dog extends Animal{

public void eat(){
		
		System.out.println("Dog is eating");
	}
	/*public static void run(){
		
		System.out.println("Dog is running");
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		
		animal.eat();
		animal.run();
		
		Dog.run();
	}
}
