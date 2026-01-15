package com.eventmanager;

public class Ticket {
	int ticketId;
	double price;
	String eventId;
	
	public Ticket(int ticketId, double price, String eventId) {
		this.ticketId = ticketId;
		this.price = price;
		this.eventId = eventId;
	}
	
	void display() {
		System.out.println("Ticket id: " + ticketId + "| Price: " + price + "| Event Id: " + eventId);
	}
}
