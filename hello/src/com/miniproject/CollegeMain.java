package com.miniproject;

import java.util.Scanner;

public class CollegeMain {

	public static void main(String[] args) {
		
		CollegeDao dao = new CollegeDao();
		College c = new College();
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter College num,college name,Course type , fees,pcode");
		int id = Integer.parseInt(s.nextLine());
		String cname = s.nextLine();
		String ctype = s.nextLine();
		String city=s.nextLine();
		int fees = Integer.parseInt(s.nextLine());
		int pcode = Integer.parseInt(s.nextLine());
		
		/*c.setId(1);
		c.setName("Mumbai University");
		c.setCtype("Engineering");
		c.setCity("Mumbai");
		c.setFees("100000");
		c.setPcode(400710);
		dao.add(c);
		c.setId(2);
		c.setName("Chennai University");
		c.setCtype("Engineering");
		c.setCity("Chennai");
		c.setFees("1000");
		c.setPcode(400710);
		dao.add(c); */
	
		c.setId(id);
		c.setName(cname);
        c.setCtype(ctype);		
        c.setCity(city);
        c.getFees(fees);
        c.setPcode(pcode);
        
        dao.add(c);
		
		
	}
	
	
}
