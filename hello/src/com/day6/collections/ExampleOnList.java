package com.day6.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleOnList {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("Oracle");
		list1.add(".NET");
		list1.add("Python");
		list1.add("Java");

		System.out.println("-------traditional for loop---------");
		for (int i = 0; i < list1.size(); i++) {
			String str = list1.get(i);
			System.out.println(str);
		}

		/*
		 * System.out.println("-------for each loop--------"); for (String str : list1)
		 * { System.out.println(str); }
		 * 
		 * System.out.println("--------Lambda expression for loop--------");
		 * list1.forEach(str -> System.out.println(str));
		 * 
		 * System.out.println("--------traditional iterator approach------");
		 * Iterator<String> itr = list1.iterator(); while (itr.hasNext()) { String str =
		 * itr.next(); System.out.println(str);
		 */

		list1.remove(2);
		list1.subList(2, 4);
		System.out.println("\n ---------After change :-----------");
		for (String str : list1) {
			System.out.println(str);
		}
		List<String> list2 = new ArrayList<String>();
		list2.add("AI");
		list2.add("Machine Learning");

		list1.addAll(list2);
		list1.add(4, "Blockchain");

		System.out.println("\nAfter adding list2");
		list1.forEach(str -> System.out.println(str));
		
		System.out.println("----------Sublist-------");
		
			System.out.println(list1.subList(2, 6));
		}
		
	}

