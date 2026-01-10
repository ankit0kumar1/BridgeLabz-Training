package com.foodloop;

import java.util.List;

public class Order implements IOrderable{
	List<FoodItem> items ;
	private double totalAmount;
	
	public Order(List<FoodItem> items) {
		this.items = items;
		this.totalAmount = calculateTotal();
	}

	private double calculateTotal() {
		double sum =0;
		for(FoodItem item : items) {
			if(item.isAvailable()) {
				sum += item.getPrice();
			}
		}return applyDiscount(sum);
	}

	public double applyDiscount(double amount) {
		if(amount >=1000) {
			return amount *0.80; //20% discount
		}else if(amount >= 500) {
			return amount * 0.90; // 10%discount
		}
		return amount;
	}
	
	@Override
	public void placeOrder() {
		System.out.println("Order Placed Successfully:");
		System.out.println("Total payable amount: ₹" + totalAmount);
		
	}

	@Override
	public void cancelOrder() {
		System.out.println("Order Cancelled.");
		
	}
	
	

}
