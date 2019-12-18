package com.java.collection.linkedlist;

public class Runner {

	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.show();
		
		//System.out.println("After inserting at start ");
		//list.insertAtStart(34);
	
		//list.insertAtStart(44);
		
		System.out.println("After inserting at second index ");
		list.insertAt(2, 56);
		list.show();
	}
	
	
}
