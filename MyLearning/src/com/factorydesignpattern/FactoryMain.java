package com.factorydesignpattern;

public class FactoryMain {

	public static void main(String[] args) {

		OSFactory objOSFactory = new OSFactory();
		OS obj = objOSFactory.getOS("android");
		
		obj.spec();

	}

}
