package com.generics.dynamiconlinemarketplace;

public class Marketplace {
	public static void main(String[] args) {

		Book book = new Book("Java", 500);
		Clothing tshirt = new Clothing("T-Shirt", 800);
		Gadgets phone = new Gadgets("Smartphone", 25000);

		DiscountService.applyDiscount(book, 10);
		DiscountService.applyDiscount(tshirt, 20);
		DiscountService.applyDiscount(phone, 5);

		MarketplaceCatalog catalog = new MarketplaceCatalog();
		catalog.addProduct(book);
		catalog.addProduct(tshirt);
		catalog.addProduct(phone);

		catalog.displayCatalog();
	}
}
