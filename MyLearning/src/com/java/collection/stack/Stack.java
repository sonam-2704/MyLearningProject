package com.java.collection.stack;

public class Stack {

	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {

		stack[top] = data;
		top++;
	}

	public void show() {

		for (int s : stack) {

			System.out.print(s);
		}

		System.out.println();
	}

	public int size() {

		return top;
	}

	public boolean isEmpty() {

		return top <= 0;

	}

	public int pop() {

		int data = 0;
		
		System.out.println("top: " + top);

		if (isEmpty())
			System.out.println("Stack is empty");
		else {
			top--;
			data = stack[top];
			stack[top] = 0;
		}

		return data;

	}

	public int peek() {

		int data = 0;

		data = stack[top-1];

		return data;

	}
}
