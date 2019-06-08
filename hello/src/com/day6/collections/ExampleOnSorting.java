package com.day6.collections;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExampleOnSorting {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(50);
		list1.add(30);
		list1.add(40);
		list1.add(60);

		System.out.println("Before sorting--------");
		for (Integer n : list1)
			System.out.println(n);

		System.out.println("After sorting------");
		TreeSet<Integer> tree = new TreeSet<Integer>(list1);
		for (Integer no : tree) {
			System.out.println(no);
		}

		Collections.sort(list1);
		System.out.println("sort method");
		for (Integer no : list1)
			System.out.println(no);

		// how to sort data in case of user defined objects in a collection
		List<Person> listOfPersons = new ArrayList<Person>();
		listOfPersons.add(new Person("Swami", 21));
		listOfPersons.add(new Person("Syed", 19));

		Comparator<Person> c = new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		};

		// using lambda expression to sort the age
		// this is in descending order.. for ascending, give p1-p2
		Comparator<Person> c1 = (p1, p2) -> p2.getAge() - p1.getAge();
		
		//using lambda expression to sort the name
		//this is in ascending order.. for descending, use -p1.compare(p2)
		Comparator <Person> c2=(p1,p2) -> p1.getName().compareTo(p2.getName());
		
		
		Collections.sort(listOfPersons, c1);
		for (Person p : listOfPersons) {
			System.out.println(p);
		}

	}

}
