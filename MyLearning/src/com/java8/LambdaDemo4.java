package com.java8;

class MyRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			System.out.println("Child Thread1");
		}
	}

}

public class LambdaDemo4 {

	public static void main(String[] args) {

		MyRunnable objMyRunnable = new MyRunnable();
		Thread t =  new Thread(objMyRunnable);
		t.start();
		for (int i = 1; i <= 10; i++) {

			System.out.println("Main Thread1");
		}

		Runnable r = ()->{

			for (int i = 1; i <= 10; i++) {

				System.out.println("Child Thread2");
			}
			
		};
		
		Thread t2 = new Thread(r);
		t2.start();
		

	}

}
