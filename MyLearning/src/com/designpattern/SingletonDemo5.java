package com.designpattern;

enum Abc5{
	
	INSTANCE;
	
	int i;
	public void show(){
		System.out.println(i);
	}
}
public class SingletonDemo5 {

	public static void main(String[] args) {

		Abc5 obj = Abc5.INSTANCE;
		obj.i=5;
		obj.show();
		
		
	}

}
