package com.observerDesignPattern;

public class ObserverPatternDemo {

	public static void main(String[] args) {

		Subject objSubject = new Subject();

		Observer1 observer1 = new Observer1(objSubject);

		objSubject.setState(10);

	}

}
