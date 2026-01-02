package com.polymorphismandencapsulation.bankingsystem;

public abstract class BankAccount {

	// Encapsulated fields (secured)
	private String accountNumber;
	private String holderName;
	private double balance;

	// Constructor to initialize account details
	public BankAccount(String accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	// Getter methods (no direct setter for balance)
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	protected double getBalance() {
		return balance;
	}

	// Deposit money (concrete method)
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	// Withdraw money (concrete method)
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}

	// Abstract method to calculate interest
	public abstract double calculateInterest();
}
