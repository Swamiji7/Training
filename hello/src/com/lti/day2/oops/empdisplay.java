package com.lti.day2.oops;

import com.lti.da.passport;

public class empdisplay {

	public static void main(String[] args) {
		employee emp = new employee();
		emp.setEmpno(101);
		emp.setName("Syed");
		emp.setDateOfJoining("26-06-2015");
		emp.setSalary(2000.00);
		
		passport pass=new passport();
		pass.setExpiryDate("30/05/2025");
		pass.setIssueDate("1/06/2019");
		pass.setNameofThePerson("Syed");
		pass.setPassportNo(1234); 
		emp.setPass(pass);

		aadharcard aadhar=new aadharcard(12344,"Syed","Mumbai");
		aadhar.setAadharNo(12345);
		aadhar.setAddress("Mumbai");
		aadhar.setName("Syed");
		emp.setAadhar(aadhar);
		emp.print();
		
		
		
		
	}
}
