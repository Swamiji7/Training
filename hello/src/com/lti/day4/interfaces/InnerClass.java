package com.lti.day4.interfaces;

interface Printer{
	void print(String document);
}


	class DotMatrixPrinter implements Printer{
		
		public void print(String document) {
			System.out.println("Currently printing"+ document);
		}
	}
	
	public class InnerClass {

	public static void main(String[] args) {
		Printer sp = new Printer() {
			public void print(String document) {
				System.out.println("Now printing " + document);
			}
		}
		sp.print("xyz.txt");
	}
}

