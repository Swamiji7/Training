package com.lti.day4;

public class Employee {

	private int empno;
	private String name;
	
	private double salary;
	public static String companyName;

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
		this.name = name;
	}

	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		Employee.salary = salary;
	}
	
	
	
}
