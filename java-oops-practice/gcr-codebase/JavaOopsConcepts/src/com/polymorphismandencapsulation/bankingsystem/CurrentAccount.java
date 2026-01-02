package com.polymorphismandencapsulation.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

	private double requestedLoanAmount;

	// Constructor
	public CurrentAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	// Interest calculation for current account
	public double calculateInterest() {
		return getBalance() * 0.02;
	}

	// Apply for loan
	public void applyForLoan(double loanAmount) {
		this.requestedLoanAmount = loanAmount;
	}

	// Loan eligibility based on balance
	public boolean calculateLoanEligibility() {
		return getBalance() >= requestedLoanAmount;
	}
}