package com.inheritance.multilevelinheritance;

import java.time.LocalDate;

public class DeliverOrder extends ShippedOrder {

	private LocalDate deliveryDate;

	public DeliverOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;

	}

	@Override
	public String getOrderStatus() {
		return "Order Delivered on " + deliveryDate;
	}
	

}
