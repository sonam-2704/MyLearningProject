package com.java.collection.stack;

public class Runner {
	
	public static void main(String[] args) {
		
		
		Stack stack = new Stack();
		
		System.out.println("Empty: "+stack.isEmpty());
		System.out.println("Size of stack is: "+stack.size());
		stack.push(1);
		
		stack.push(2);
		System.out.println("Element peek: "+stack.peek());
		stack.push(3);
		stack.push(4);
		
		stack.show();
		System.out.println("Empty: "+stack.isEmpty());
		
		System.out.println("Element popped: "+stack.pop());
		stack.show();
		System.out.println("Size of stack is: "+stack.size());
		System.out.println("Element popped: "+stack.pop());
		System.out.println("Size of stack is: "+stack.size());
		System.out.println("Element popped: "+stack.pop());
		System.out.println("Size of stack is: "+stack.size());
		System.out.println("Element popped: "+stack.pop());
		System.out.println("Size of stack is: "+stack.size());
		System.out.println("Element popped: "+stack.pop());
	}


}
