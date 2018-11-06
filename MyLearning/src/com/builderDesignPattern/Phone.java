package com.builderDesignPattern;

public class Phone {

	public String os;
	public int ram;
	public String processor;
	public double screensize;
	public int battery;

	public Phone(String os, int ram, String processor, double screensize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screensize = screensize;
		this.battery = battery;
	}

	public Phone(PhoneBuilder phoneBuilder) {

		this.os = phoneBuilder.os;
		this.ram = phoneBuilder.ram;
		this.processor = phoneBuilder.processor;
		this.screensize = phoneBuilder.screensize;
		this.battery = phoneBuilder.battery;

	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screensize=" + screensize
				+ ", battery=" + battery + "]";
	}

}
