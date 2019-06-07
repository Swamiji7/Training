package com.lti.training.day5.objectclass;

public class TestPerson {

	public static void main(String[] args) {
		// Person p1=new Person("Syed",21);
		Person p1 = new Person("Syed", 21);
		System.out.println(p1);
		// System.out.println(p2);
		Person p2 = new Person("syed", 21);
		// System.out.println(p1==p2); // reference comparison
		System.out.println(p1.equals(p2)); // value comparison

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		try {

			Person p3 = (Person) p1.clone();
			System.out.println(p3);
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
	
	p1 = null;
	p2 = null;
	System.gc();  
	}

	
	
}
