package com.java8;

@FunctionalInterface
public interface Interf {

	
	public void m1();
	
	default void m2(){
		
	};
	
	static void m3(){
		
	};
}
