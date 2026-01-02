package com.polymorphismandencapsulation.ecommerce;

public abstract class Product {
	private int productId;
	private String name;
	private double price;
	
	//Constructor
	public Product(int productId, String name, double price) {
		this.name = name;
		this.price = price;
		this.productId =productId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>0)
		this.price = price;
	}
	
	public abstract double calculateDiscount();
	public void productDetails() {
		System.out.println("Product Id: " + getProductId());
		System.out.println("Product Name: " + getName());
		System.out.println("Product Id: " + getPrice());
	}
	
}
