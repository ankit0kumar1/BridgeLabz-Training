package com.polymorphismandencapsulation.fooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

	// Constructor
	public NonVegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	// Total price calculation with additional non-veg charge

	public double calculateTotalPrice() {
		double basePrice = getPrice() * getQuantity();
		double nonVegCharge = basePrice * 0.15; // additional charge
		return basePrice + nonVegCharge;
	}

	// Apply discount (5% for non-veg items)
	public double applyDiscount() {
		return calculateTotalPrice() * 0.05;
	}

	// Discount details

	public String getDiscountDetails() {
		return "5% discount applicable on Non-Veg Items";
	}
}