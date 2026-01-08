package com.bookbazar;

 class Order {
	private Book book;
	private int quantity;
	private String user;
	private String status;
	
	public Order(String user, Book book , int quantity) {
		this.user = user;
		this.book = book;
		this.quantity= quantity;
		this.status ="CREATED"; 
	}
	
	public double calculateTotal() {
		double discount = book.applyDiscount(book.price, quantity);
		return (book.price *quantity)-discount;
	}
	
	public void updateStatus(String newStatus) {
		this.status = newStatus;
	}
	public void placeOrder() {
		book.reduceStock(quantity);
		updateStatus("Confirmed");
	}
	public String getStatus() {
		return status;
	}
}
