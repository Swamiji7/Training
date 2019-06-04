package com.example_inheritance;

public class Product {
	String name;
	int id;
	int stock = 100;
	int price;
	String desc;
	int discount;
	private String productType;
	
	private Book b;
	private Toy t;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void identify() {
		if(productType=="Book")
			 b.setBook();
		else if(productType=="Toy")
			 t.setToy();
		else 
			System.out.println("Wrong type");
	}

	public int discount (int x) {
		if(productType=="Book")
			{
			int newPrice=price*(10/100);
			return newPrice;
			}
		if(productType=="Toy")
		{
			int newPrice=price*(15/100);
			return newPrice;
		}
		return x;
		
		
	}
	
	public void display() {
		System.out.println(getName());
		System.out.println(getId());
		System.out.println(getProductType());
		System.out.println(getStock());
		System.out.println(getDesc());
		System.out.println(getDiscount());
	}

}
