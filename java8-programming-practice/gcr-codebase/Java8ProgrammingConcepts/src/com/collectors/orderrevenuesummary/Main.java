package com.collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
                new Order("Ankit", 250.50),
                new Order("Ravi", 100.00),
                new Order("Ankit", 300.00),
                new Order("Neha", 150.75),
                new Order("Ravi", 50.00)
        );
		
		Map<String , Double> total = orders.stream()
				.collect(Collectors.groupingBy(Order::getCustomer,
						Collectors.summingDouble(Order::getAmount)
						));
		System.out.println(total);
	}
}
