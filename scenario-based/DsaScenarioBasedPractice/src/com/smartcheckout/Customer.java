package com.smartcheckout;

import java.util.*;
public class Customer {
	int cusotmerId;
	String name;
	List<CartItem> cartItems;
	
	Customer(int customerId, String name){
		this.cusotmerId = customerId;
		this.name = name;
		this.cartItems = new ArrayList<>();
	}
	
	void addItems(String itemId , int quantity) {
		cartItems.add(new CartItem(itemId , quantity));
	}
}
