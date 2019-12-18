package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<Product>productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",280280000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        Set<Float>productPriceList =   
	                productsList.stream()
	                .filter(x->x.price>30000f)
	                            .map(x->x.price)         // fetching price  
	                            .collect(Collectors.toSet());   // collecting as list  
	        System.out.println(productPriceList);  
	        
	        Set<Product>productList =   
	                productsList.stream()
	                            .collect(Collectors.toSet());   // collecting as list  
	        System.out.println(productList);  
	        
	        
	}

}


class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  