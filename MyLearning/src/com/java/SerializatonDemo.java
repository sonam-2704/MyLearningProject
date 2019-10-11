package com.java;

import java.io.*;

class Student implements Serializable {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class SerializatonDemo {

	public static void main(String[] args) {

		try {
			Student st = new Student(101, "John");
			FileOutputStream fos = new FileOutputStream("student.info");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
