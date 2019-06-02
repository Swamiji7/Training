package com.lti.day2.oops;

import com.lti.da.passport;

public class employee {

	private int empno;
	private String name;
	private String dateOfJoining;
	private double salary;   
	
	private passport pass;
	private aadharcard aadhar;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name ;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public passport getPass() {
		return pass;
	}
	public void setPass(passport pass) {
		this.pass = pass;
	}
	public aadharcard getAadhar() {
		return aadhar;
	}
	public void setAadhar(aadharcard aadhar) {
		this.aadhar = aadhar;
	}
	
	public void print() {
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Aadhar no :"+getAadhar().getAadharNo());
		System.out.println("Passport no :"+getPass().getPassportNo());
	}
	
	
}
