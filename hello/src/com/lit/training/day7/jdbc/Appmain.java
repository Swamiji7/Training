package com.lit.training.day7.jdbc;

import java.util.List;

public class Appmain {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		/*Product p = new Product();
		/*p.setId(2);
		p.setName("Nokia 6000");
		p.setPrice(10000);
		p.setQuantity(99);
		dao.add(p);
		*/
		
		List<Product> products=dao.fetchAll();
		for(Product p : products) {
		System.out.println("ID : "+p.getId());
		System.out.println("Name : "+p.getName());
		System.out.println("Price : "+p.getPrice());
		System.out.println("Quantity : "+p.getQuantity());
		}
	}
}