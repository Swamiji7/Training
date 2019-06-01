package com.lti.day2.oops;

import com.lti.da.passport;

public class app {

public static void main(String[] args) {
	// creating object of Student class
	
	student s1=new student();
	s1.name="Swami";
	s1.college="SSN";
	s1.doj="21/05/2019";
	System.out.println(s1.name);
	System.out.println(s1.college);
	System.out.println(s1.doj);
	
	passport p = new passport();
	p.setPassportNo(3454);
	System.out.println(p.getPassportNo());
	p.setExpiryDate("25-09-2019");
	System.out.println(p.getExpiryDate());
	p.setIssueDate("25-04-2019");
	System.out.println(p.getIssueDate());
	p.setNameofThePerson("syed");
	System.out.println(p.getNameofThePerson());
		
	aadharcard ac=new aadharcard(12344,"Syed","Mumbai");
	
	System.out.println(ac.getAadharNo());
	System.out.println(ac.getName());
	System.out.println(ac.getAddress());
    
	
	
	}
	
	
	
	
}
