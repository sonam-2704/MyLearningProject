package com.designpattern;


/**
 * Lazy instantiation
 *
 */

class Abc2{
	
	private static Abc2 obj;
	
	private Abc2(){
		
		
	}
	
	public static Abc2 getInstance(){
		
		if(obj==null){
			
			obj= new Abc2();	// lazy..
			
		}
		
		return obj;
	}
}


public class SingletonDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
