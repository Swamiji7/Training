package com.example_inheritance2;

public abstract class Product {

	private static int sequence=1000;

	private int id=sequence++;
	private String name;
	private int stockInHand;
	private double price;
	private String description;
	private Book b;
	private Toy t;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getStockInHand() {
		return stockInHand;
	}
	public double getPrice() {
		return price;
	}
	
	public abstract double calculateDiscount() ;

	
	public double generateBill(int quantity) {
		double total = (  price - calculateDiscount())*  quantity;
		return total;
	}
	public Product(String name, int stockInHand, double price, String description) {
		super();
		this.name = name;
		this.stockInHand = stockInHand;
		this.price = price;
		this.description = description;
	}
	
	
}
 