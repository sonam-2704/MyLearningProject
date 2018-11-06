package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer I1, Integer I2) {

		if (I1 < I2)
			return -1;
		else if (I1 > I2)
			return 1;
		else
			return 0;
	}

}

public class LambdaDemo3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(5);
		list.add(15);
		list.add(25);
		list.add(45);
		list.add(50);

		System.out.println(list);
		
		Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(list, c);
		
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<Integer>();

		list2.add(10);
		list2.add(455);
		list2.add(115);
		list2.add(100);
		list2.add(145);
		list2.add(1456);
		
		System.out.println(list2);
		
		MyComparator objMyComparator = new MyComparator();
		Collections.sort(list2, objMyComparator);
		
		System.out.println(list2);
			
	}

}
