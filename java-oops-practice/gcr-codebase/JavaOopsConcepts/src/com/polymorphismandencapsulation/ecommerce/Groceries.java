package com.polymorphismandencapsulation.ecommerce;

public class Groceries extends Product{

	public Groceries(int productId, String name, double price) {
		super(productId, name, price);
	
	}
	public double getFinalPrice() {
		return (getPrice()-calculateDiscount());
	}

	@Override
	public double calculateDiscount() {
		return getPrice()*0.04; //4% discount
	}
public void productDetails() {
		
		super.productDetails();
		
		System.out.println("Discounted: " + calculateDiscount());
		System.out.println("Final Price: " + getFinalPrice());
		System.out.println("-----------------");
	}
	
}
