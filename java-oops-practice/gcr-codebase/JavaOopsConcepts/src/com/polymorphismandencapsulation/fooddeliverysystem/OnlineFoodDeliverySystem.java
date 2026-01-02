package com.polymorphismandencapsulation.fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate polymorphism
public class OnlineFoodDeliverySystem {

	// Single order-processing method using polymorphism
	public static void processOrder(List<FoodItem> orderItems) {

		for (FoodItem item : orderItems) {

			item.getItemDetails();
			double totalPrice = item.calculateTotalPrice();
			System.out.println("Total Price : " + totalPrice);

			Discountable d = (Discountable) item;
			System.out.println(d.getDiscountDetails());
			System.out.println("Discount    : " + d.applyDiscount());

			System.out.println("----------------------------------");
		}
	}

	public static void main(String[] args) {

		// List of FoodItem references (Polymorphism)
		List<FoodItem> order = new ArrayList<>();

		order.add(new VegItem("Paneer Burger", 120, 2));
		order.add(new NonVegItem("Chicken Pizza", 350, 1));

		// Process the order
		processOrder(order);
	}
}
