package com.example_inheritance;

public class App {
	public static void main(String[] args) {
		Product p = new Product();
		Book b = new Book();
		Toy t = new Toy();
		p.setName("Harry Potter");
		p.setId(100);
		p.setProductType("Book");
		p.setStock(100);
		p.setDesc("Good one");
		p.setPrice(100);
		
		p.display();
		

	}

}