package com.lti.day2.oops;
import java.lang.Integer;
import java.util.Scanner;

public class str {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int x=input.nextInt();
		System.out.println("Binary :"+Integer.toBinaryString(x));
		System.out.println("Hex :"+Integer.toHexString(x));
		System.out.println("Octal : "+Integer.toOctalString(x));
	}

	

}
