package com.example_inheritance2;

public class Toy extends Product {

	public Toy(String name, int stockInHand, double price, String description,String ageGroup) {
		super(name, stockInHand, price, description);
		this.ageGroup=ageGroup;
		// TODO Auto-generated constructor stub
	}
	
	private String ageGroup;
	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
		if(ageGroup.equals("2-4"))
				return 0.15 * getPrice();
		else if(ageGroup.equals("4-5"))
				return  0.05 * getPrice();
		else 
			return 0;
	}
	
	
}
