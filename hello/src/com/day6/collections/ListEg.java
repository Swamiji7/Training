package com.day6.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEg{

	public static void main(String[] args) {
		List<Person> listOfPersons = new ArrayList<Person>();
		Person p1 = new Person("Swami", 22);
		Person p2 = new Person("Syed", 22);
		listOfPersons.add(p1);
		listOfPersons.add(p2);
	//	listOfPersons.add(new Person("Swami", 22));
	//	listOfPersons.add(new Person("SYED", 21));
		listOfPersons.forEach(str -> System.out.println(str)); 
}

}




