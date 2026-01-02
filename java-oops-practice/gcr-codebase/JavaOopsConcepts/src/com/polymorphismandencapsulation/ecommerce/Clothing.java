package com.polymorphismandencapsulation.ecommerce;

public class Clothing extends Product implements Taxable{

	public Clothing(int productId, String name, double price) {
		super(productId, name, price);
		
	}

	@Override
	public double calculateTax() {
		return getPrice()*0.05; //5% tax
	}

	@Override
	public String getTaxDetails() {
		return "Clothing GST: 5%";
	}

	@Override
	public double calculateDiscount() {
		return getPrice()*0.20; //20% discount
	}
	
	
	public double getFinalPrice() {
		return (getPrice()+calculateTax()-calculateDiscount());
	}
	@Override
	public void productDetails() {
		
		super.productDetails();
		System.out.println("Tax Details: " + getTaxDetails());
		System.out.println("Taxed Amount: " + calculateTax());
		System.out.println("Discounted: " + calculateDiscount());
		System.out.println("Final Price: " + getFinalPrice());
		System.out.println("-----------------");
	}
	
	

}
