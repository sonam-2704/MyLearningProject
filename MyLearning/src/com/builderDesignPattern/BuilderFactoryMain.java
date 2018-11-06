package com.builderDesignPattern;

public class BuilderFactoryMain {

	public static void main(String[] args) {

		Phone p  = new PhoneBuilder().setOs("Windows").setProcessor("Qualcore").setRam(4).getPhone();
		
		System.out.println(p);
		
		Phone phone = new PhoneBuilder().setOs("Android").setScreensize(5.5).setRam(8).build();
		
		System.out.println(phone);
		
	}

}
