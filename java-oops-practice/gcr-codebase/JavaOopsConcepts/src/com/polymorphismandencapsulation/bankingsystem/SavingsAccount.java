package com.polymorphismandencapsulation.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {

	private double requestedLoanAmount;

	// Constructor
	public SavingsAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	// Interest calculation for savings account 
	public double calculateInterest() {
		return getBalance() * 0.04;
	}

	// Apply for loan
	public void applyForLoan(double loanAmount) {
		this.requestedLoanAmount = loanAmount;
	}

	// Loan eligibility based on balance
	public boolean calculateLoanEligibility() {
		return getBalance() >= requestedLoanAmount * 0.5;
	}
}
