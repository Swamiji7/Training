package com.lti.day2.oops;

public class aadharcard {
	long aadharNo;
	String name;
	String address;
	
	public aadharcard(long aadharNo, String name, String address) {
		//super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.address = address;}
	
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
