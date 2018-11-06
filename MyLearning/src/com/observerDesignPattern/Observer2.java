package com.observerDesignPattern;

public class Observer2 extends Observer {

	public Observer2(Subject subject) {

		this.subject = subject;
		this.subject.attach(this);

	}

	@Override
	public void update() {

		System.out.println("Observer2 notified");
	}

}
