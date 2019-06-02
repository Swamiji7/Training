package com.lti.day2.oops;

public class Customer {

	private String name;
	private String email;
	private Address address; // has-a relationship
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("City :"+getAddress().getCity());
		System.out.println("Name : "+getAddress().getState());
		System.out.println("Pincode :"+getAddress().getPincode());
		
	}
}
