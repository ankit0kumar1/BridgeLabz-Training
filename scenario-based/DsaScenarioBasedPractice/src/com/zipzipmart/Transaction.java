package com.zipzipmart;

class Transaction {
	int transactionId;
	String date; //YYYY-MM-DD
	double amount;
	String branchId;

	Transaction(int transactionId, String date, double amount, String branchId) {
		this.transactionId = transactionId;
		this.date = date;
		this.amount = amount;
		this.branchId = branchId;
	}

	void display() {
		System.out.println(transactionId + " | " + date + " | ₹" + amount + " | Branch: " + branchId);
	}
}
