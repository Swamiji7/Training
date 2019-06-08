package com.day6.collections;

import java.util.Set;
import java.util.HashSet;

public class ExampleOnSet {
	
	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Java");
		set1.add("Oracle");
		set1.add("PHP");
		set1.add(".NET");
		set1.add("Java");
		
		set1.forEach(str->System.out.println(str));
		
		Set<Person> setOfPersons = new HashSet<>();
		setOfPersons.add(new Person("Swami",99));
		setOfPersons.add(new Person("Swami",99));
		setOfPersons.add(new Person("Einstein",99));
		setOfPersons.add(new Person("Newton",99));
		setOfPersons.add(new Person("Ramanujan",99));
		
		System.out.println("\nSet----");
		setOfPersons.forEach(str->System.out.println(str));
		
	}
	
	
	

}
