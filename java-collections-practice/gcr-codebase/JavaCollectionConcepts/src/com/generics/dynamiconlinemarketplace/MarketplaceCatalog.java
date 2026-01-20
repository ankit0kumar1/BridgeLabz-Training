package com.generics.dynamiconlinemarketplace;

import java.util.*;

public class MarketplaceCatalog {
	private java.util.List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public void displayCatalog() {
		for (Product p : products) {
			System.out.println(p.getCategory() + " → " + p.getName() + " : ₹" + p.getPrice());
		}
	}
}
