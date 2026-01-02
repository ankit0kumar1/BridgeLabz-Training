package com.polymorphismandencapsulation.ecommerce;

public class Electronics extends Product implements Taxable{
	

	public Electronics(int productId, String name, double price ) {
		super(productId, name, price);
		
	}
	
	@Override
	public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
	}
	@Override
	public String getTaxDetails() {
		 return "Electronics GST: 18%";
		
	}
	@Override
	public double calculateDiscount() {
		return getPrice() * 0.10; // 10% discount
	}
	public double getFinalPrice() {
		return (getPrice()+calculateTax()-calculateDiscount());
	}
public void productDetails() {
		
		super.productDetails();
		System.out.println("Tax Details: " + getTaxDetails());
		System.out.println("Taxed Amount: " + calculateTax());
		System.out.println("Discounted: " + calculateDiscount());
		System.out.printf("Final Price: %.2f%n" , getFinalPrice());
		System.out.println("-----------------");
	}

	
	

}
