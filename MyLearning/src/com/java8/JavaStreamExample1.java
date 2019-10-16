package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamExample1 {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// Converting product List into Set
		Set<Float> productPriceList = productsList.stream().filter(product -> product.price < 30000) // filter product on the base of price
				.map(product -> product.price).collect(Collectors.toSet()); // collect it as Set(remove duplicate elements)
		System.out.println(productPriceList);
		
		
		Set<Product> productPriceList2 = productsList.stream().filter(product -> product.price < 30000).collect(Collectors.toSet());
		
		System.out.println(productPriceList2);
		
		for(Product p : productPriceList2){
			
			System.out.println(p.id);
			System.out.println(p.name);
			System.out.println(p.price);
		}
		
		Stream<Product> x = productsList.stream().filter(product -> product.price < 30000);
		
		
	}
}
