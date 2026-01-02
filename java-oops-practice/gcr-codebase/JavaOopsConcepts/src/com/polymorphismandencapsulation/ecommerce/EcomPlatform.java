package com.polymorphismandencapsulation.ecommerce;

import java.util.*;
public class EcomPlatform {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Electronics(1, "TV", 50000));
		products.add(new Clothing(2, "Tshirt", 250));
		products.add(new Groceries(3, "Rice Bag", 950));
		
		for(Product p : products) {
			p.productDetails();
		}
	}
}
