package com.lti.day4.interfaces;

public class Stringham {

	public static void main(String[] args) {

		/*
		 * String s1 = "Java"; String s2 = "Java"; String s3 = new String("Java");
		 * String s4 = new String("Java");
		 * 
		 * System.out.println(s1 == s2); System.out.println(s3 == s4); String s5 =
		 * "JAVA"; String s6 = s1.toUpperCase(); System.out.println(s5 == s6);
		 * 
		 * String s7 = "Hello"; String s8 = "World"; String s9 = "HelloWorld"; String
		 * s10 = (s7 + s8).intern(); System.out.println(s10 == s9);
		 */
		String str = "abcdefghijklmnopqrstuvwxyz";
		String newstr = "";
		long ns1 = System.nanoTime();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++)
				newstr += str.charAt(j);
		}
		long ns2 = System.nanoTime();
		System.out.println("Result:: " + newstr);
		System.out.println("Approx time taken:" + (ns2 - ns1) + " nanoseconds. ");

		System.out.println("-----------StringBuffer -------");

		StringBuffer strbuffer=new StringBuffer();
		long ns3 = System.nanoTime();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++)
				strbuffer.append(str.charAt(j));
		}
		long ns4 = System.nanoTime();
		System.out.println("Result:: " + newstr);
		System.out.println("Approx time taken:" + (ns4 - ns3) + " nanoseconds. ");

		System.out.println("-----------StringBuilder -------");
		
		StringBuilder strbuilder = new StringBuilder();
		long ns5 = System.nanoTime();
		for (int i = 0; i < str.length(); i++)
			for (int j = 0; j <= i; j++)
				strbuilder.append(str.charAt(j));

		long ns6 = System.nanoTime();
		System.out.println("Result:: " + strbuilder);
		System.out.println("Approx time taken:" + (ns6 - ns5) + " nanoseconds. ");

	}
}
