package com.lti.day2.oops;

public class Customerinfo {
	
	public static void main(String[] args) {
		Customer c=new Customer();
		Address a= new Address();
		c.setName("Swami");
		c.setEmail("swami121");
		a.setCity("Mumbai");
		a.setPincode(596534);
		a.setState("MP");
		c.setAddress(a); 
		c.display();
	}
	
	

}
