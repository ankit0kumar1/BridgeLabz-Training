package com.bookbazar;

 abstract class Book implements IDiscountable{
	protected String title;
	protected String author;
	protected double price;
	private int stock; // encapsulated
	
	public Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	//controlled stock access
	public int getStock() {
		return stock;
	}
	
	public void reduceStock(int quantity) {
		if(quantity <= stock) {
			stock -= quantity;
		}else {
			throw new RuntimeException("Insufficient Stock");
		}
	}
	
	public abstract double applyDiscount(double price, int quantity);
}
