package com.inheritance.multilevelinheritance;

import java.time.LocalDate;

public class RunOrder {

	public static void main(String[] args) {

		Order order1 = new Order("ORD101", LocalDate.now());

		Order order2 = new ShippedOrder("ORD102", LocalDate.now().minusDays(2), "TRK76457");

		Order order3 = new DeliverOrder("ORD103", LocalDate.now().minusDays(5), "TRK65485", LocalDate.now());

		System.out.println(order1.getOrderStatus());
		System.out.println(order2.getOrderStatus());
		System.out.println(order3.getOrderStatus());
		
	}

}
