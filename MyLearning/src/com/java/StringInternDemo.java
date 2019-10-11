package com.java;

import java.util.HashMap;
import java.util.Map;

public class StringInternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String("Sachin");  
		String s2=s.intern();  
		System.out.println(s2);//Sachin  
		
		String s3 = "Sachin";
		
		if(s2==s3){
			System.out.println("They are pointing to same object in string constant pool");
		}
		
		 Map<String,Integer> map = new HashMap<>();
	        map.put("Abhi",123);
	        map.put("Anup",789);
	        map.put(null,456);
	        map.put("Abhi",555);
	        map.put("Ashish",null);
	        
	        System.out.println(map.get("Abhi"));
	        System.out.println(map.get(null));
	        System.out.println(map.get("Ashish"));
	        
	}

}
