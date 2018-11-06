package com.builderDesignPattern;

public class PhoneBuilder {

	public String os;
	public int ram;
	public String processor;
	public double screensize;
	public int battery;

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PhoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public Phone getPhone() {

		return new Phone(os, ram, processor, screensize, battery);

	}
	
	public Phone build(){
		
		return new Phone(this);
	}
}
