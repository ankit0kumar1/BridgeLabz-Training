package com.inheritance.multilevelinheritance;

import java.time.*;
public class Order {
	protected String orderId;
	protected LocalDate orderDate;
	
	public Order(String orderId, LocalDate orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return "Order Placed";
	}
	
	
}
