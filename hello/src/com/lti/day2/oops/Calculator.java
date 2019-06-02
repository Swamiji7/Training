package com.lti.day2.oops;
import java.util.Scanner;
public class Calculator {
	
	public  void add(int x,int y) {
		System.out.println(x+y);
	}
	
	public void sub(int x,int y) {
		System.out.println(x-y);
	}
	public void mul(int x,int y) {
		System.out.println(x*y);
	}
	public void div(int x,int y) {
		System.out.println(x/y);
	}
	
	public static void main(String[] args) {
		int x,y,z;
		Calculator c=new Calculator();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter x and y :");
		x=input.nextInt();
		y=input.nextInt();
		System.out.println("Options :");
		System.out.println("1.ADD 2. SUBTRACTION 3. MUL 4. DIV ");
		System.out.println("Enter your choice: ");
		z=input.nextInt();
	    switch(z) {
	    case 1:
	    			c.add(x,y);
	    			break;
	    case 2:
	    			c.sub(x,y);
	    			break;
	    case 3:
	    			c.mul(x,y);
	    			break;
	    case 4:	
	    			c.div(x,y);
	    			break;
	    default:
	    	System.out.println("Invalid Option !! ");
	    }
	}

}

