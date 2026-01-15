package com.zipzipmart;

public class ZipMartApp {

	public static void main(String[] args) {

		Transaction[] transactions = { new Transaction(101, "2025-01-10", 2500.50, "Delhi"),
				new Transaction(102, "2025-01-08", 1800.00, "Mumbai"),
				new Transaction(103, "2025-01-10", 1200.75, "Chennai"),
				new Transaction(104, "2025-01-08", 1800.00, "Pune"),
				new Transaction(105, "2025-01-09", 3200.00, "Bangalore") };

		System.out.println("Before Sorting:");
		for (Transaction t : transactions) {
			t.display();
		}

		ZipMart.mergeSort(transactions, 0, transactions.length - 1);

		System.out.println("\nAfter Sorting (By Date, Then Amount):");
		for (Transaction t : transactions) {
			t.display();
		}
	}

}
