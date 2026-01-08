package com.bookbazar;

 class PrintedBook extends Book{
	public PrintedBook(String title, String author, double price, int stock) {
		super(title, author, price, stock);
	}

	@Override
	public double applyDiscount(double price, int quantity) {
		return price * quantity * 0.10; // 10% discount
	}
}
