package com.example_inheritance2;

public class Book extends Product { 
	
	public Book(String name, int stockInHand, double price, String description) {
		super(name, stockInHand, price, description);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		return 0.1 * getPrice();
	}
	
}
