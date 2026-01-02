package com.polymorphismandencapsulation.fooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {

	// Constructor
	public VegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	// Total price calculation for veg item
	@Override
	public double calculateTotalPrice() {
		return getPrice() * getQuantity();
	}

	// Apply discount (10% for veg items)
	@Override
	public double applyDiscount() {
		return calculateTotalPrice() * 0.10;
	}

	// Discount details
	@Override
	public String getDiscountDetails() {
		return "10% discount applicable on Veg Items";
	}
}
