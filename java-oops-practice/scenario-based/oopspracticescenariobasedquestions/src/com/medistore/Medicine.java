package com.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable{
	
	private String name;
	private double price;
	private int quantity;
	protected LocalDate expiryDate;
	
	//Constructor
	public Medicine(String name, double price , LocalDate expiryDate) {
		this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
	}
	//encapsulated stock access
	protected boolean hasStock(int qty) {
		return quantity>=qty;
	}
	protected void reduceStock(int qty) {
		quantity -= qty;
	}
	
	private double applyDiscount(double total) {
		return total >1000 ? total * 0.10 : total;
	}
	
	@Override
	public double sell(int qty) {
		if(checkExpiry()) {
			System.out.println("Medicine Expired. Cannot sell");
			return 0;
		}
		
		if(!hasStock(qty)) {
			System.out.println("Insufficient Stock.");
			return 0;
		}
		double total = price * qty;            
        total = applyDiscount(total);           
        reduceStock(qty);  

        return total;
	}
	public String getName() {
		return name;
	}
}
