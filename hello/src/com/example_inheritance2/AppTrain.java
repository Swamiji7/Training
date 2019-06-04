package com.example_inheritance2;

public class AppTrain {
	public static void main(String[] args) {

		Book b1 = new Book("Java", 99,500,"A classic book on Java");
		Book b2 = new Book("SQL",99,400,"A classic book on DBMS");
		
		Toy t1=new Toy("Car",98,500,"RC Car","4-5");
		Toy t2=new Toy("Plane",98,300,"RC Plane","5+");
		
		double bill1=b1.generateBill(2);
		System.out.println("The bill for "+b1.getName()+" with the quantity is "+bill1);
	
		System.out.println(" Id "+b1.getId());
		System.out.println(" Name "+b1.getName());
		System.out.println(" Price "+b1.getPrice());
		
	
	
		
					
			
		
		
	}


	
}