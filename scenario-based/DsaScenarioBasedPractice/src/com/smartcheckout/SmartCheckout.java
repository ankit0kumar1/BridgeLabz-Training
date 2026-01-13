package com.smartcheckout;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SmartCheckout {
	Queue<Customer> customerQueue;
	HashMap<String, Item> itemCatalog;
	
	public SmartCheckout() {
		customerQueue = new LinkedList<>();
		itemCatalog = new HashMap<>();
	}
	
	void addCustomer(Customer customer) {
		customerQueue.add(customer);
		System.out.println(customer.name + " joined the queue");
	}
	
	void addItemCatalog(Item item) {
		itemCatalog.put(item.itemId, item);
	}
	
	void processCheckout() {
		if(customerQueue.isEmpty()) {
			System.out.println("No Customer in queue");
			return;
		}
		Customer customer = customerQueue.poll();
		double totalAmount = 0;
		
		System.out.println("\nProcessing for payment");
		for(CartItem cartItem : customer.cartItems) {
			Item item = itemCatalog.get(cartItem.itemId);
			
			if(item == null ) {
				System.out.println("Item not found");
				continue;
			}
			
			if(item.stock< cartItem.quantity) {
				System.out.println("Insufficient quantity in the stock");
				continue;
			}
			
			double cost = item.price * cartItem.quantity;
			totalAmount += cost;
			item.updateStock(cartItem.quantity);
			System.out.println(item.name + " x " + cartItem.quantity + "= ₹" + cost);
		}
		System.out.println("TOTAL BILLED AMOUNT IS : " + totalAmount);
		
	}
}
