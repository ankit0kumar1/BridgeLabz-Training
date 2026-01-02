package com.polymorphismandencapsulation.fooddeliverysystem;

public abstract class FoodItem {

	// Encapsulated fields
	private String itemName;
	private double price;
	private int quantity;

	// Constructor to initialize food item details
	public FoodItem(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	// Getter methods (Encapsulation)
	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	protected int getQuantity() {
		return quantity;
	}

	// Abstract method to calculate total price
	public abstract double calculateTotalPrice();

	// Concrete method to display item details
	public void getItemDetails() {
		System.out.println("Item Name : " + itemName);
		System.out.println("Price     : " + price);
		System.out.println("Quantity  : " + quantity);
	}
}
