package com.inheritance.hierarchicalinheritance;

public class FixedDepositAccount extends BankAccount {
	private double interestRate;
	private int lockInPeriod;

	public FixedDepositAccount(String accountNumber, double balance, double interestRate, int lockInPeriod) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
		this.lockInPeriod = lockInPeriod;
	}

	public void displayAccountType() {
		System.out.println("Account Type: Fixed Deposit Account");
		displayAccountInfo();
		System.out.println("Interest Rate: " + interestRate + "%");
		System.out.println("Lock-in Period: " + lockInPeriod + " months");
		System.out.println("-----------------------------");
	}
}
