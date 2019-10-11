package com.java;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserilizationDemo {

	public static void main(String[] args) {
	    Student st = null;
	    try{
	     FileInputStream fis = new FileInputStream("student.info");
	     ObjectInputStream ois = new ObjectInputStream(fis);
	     st = (Student)ois.readObject();
	    }catch(Exception e){
	      System.out.println(e);
	    }
	    System.out.println(st.id);
	    System.out. println(st.name);
	  }
	}
