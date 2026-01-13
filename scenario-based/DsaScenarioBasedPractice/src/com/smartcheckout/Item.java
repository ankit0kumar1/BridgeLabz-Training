package com.smartcheckout;

public class Item {
	String itemId;
	String name;
	double price;
	int stock;
	
	Item(String itemId, String name, double price, int stock){
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	void updateStock(int quantity) {
		stock -= quantity;
	}
	
	
}
