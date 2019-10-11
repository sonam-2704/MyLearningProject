package com.java;

import java.util.HashMap;
import java.util.Map;

public class StringCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		String str= "EPAM SYSTEMS PUNE";
		
		char[] charArray = str.toCharArray();
		
		for(int i=0;i< charArray.length;i++){
			
			if(map.containsKey(charArray[i])){
				
				int count = map.get(charArray[i]);
				
				map.put(charArray[i],count+1);
			}
			else{
				
				map.put(charArray[i],1);
			}
			
			
			
			//System.out.println(count);
			
			//if(count)
		}
		System.out.println(map);
	}

}
