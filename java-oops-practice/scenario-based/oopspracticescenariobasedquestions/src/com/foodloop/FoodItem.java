package com.foodloop;


public abstract class FoodItem {
	private String name;
	private String category;
	private double price;
	
	private int stock;
	
	public FoodItem(String name, double price, int stock, String category) {
		this.name =name;
		this.price = price;
		this.stock = stock;
		this.category = category;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	public boolean isAvailable() {
		if(stock>0) {
			return true;
		}
		return false;
	}
	public void reduceQuantity(int qty) {
		if(stock>= qty) {
			stock -=qty;
		}
	}
	
	
}
