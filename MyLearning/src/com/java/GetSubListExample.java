package com.java;

import java.util.ArrayList;
import java.util.List;

public class GetSubListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList = new ArrayList<String>();
        
        //Add elements to Arraylist
        arrayList.add("Java");
        arrayList.add("C++");
        arrayList.add("PHP");
        arrayList.add("Scala");
                 
        /*
           subList Method returns sublist from list with starting index to end index-1
        */
     
        List<String> lst = arrayList.subList(1,3);
         
        //display elements of sub list.
        System.out.println("Sub list contains : ");
        for(int i=0; i<lst.size() ; i++)
          System.out.println(lst.get(i));
       
       
        //remove one element from sub list
        Object obj = lst.remove(0);
        System.out.println(obj + " is removed from sub list");
     
        //print original ArrayList
        System.out.println("After removing " + obj + " from sub list, original ArrayList contains : ");
        for(int i=0; i< arrayList.size() ; i++)
          System.out.println(arrayList.get(i));
    
      }

}
