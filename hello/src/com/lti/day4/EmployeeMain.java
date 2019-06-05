package com.lti.day4;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee.companyName="LTI";
		
		Employee emp1=new Employee();
		emp1.setEmpno(1001);
		emp1.setName("Swami");
		emp1.setSalary(100);
		
		
		Employee emp2=new Employee();
		emp2.setEmpno(1002);
		emp2.setName("Syed");
		emp2.setSalary(10000000);
		
		System.out.println(emp1.getEmpno());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
		System.out.println(emp2.getEmpno());
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
		
	}
	
	
}
