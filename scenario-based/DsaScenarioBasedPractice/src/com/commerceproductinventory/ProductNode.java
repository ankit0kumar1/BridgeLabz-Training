package com.commerceproductinventory;

public class ProductNode {
	int sku;
	String productName;
	double price;
	ProductNode left, right;
	
	
	public ProductNode(int sku, String productName, double price) {
		this.sku = sku;
		this.productName = productName;
		this.price = price;
		left =right = null;
	}
	
	@Override
	public String toString() {
		return sku +" " + productName + " " + price; 
	}
}
