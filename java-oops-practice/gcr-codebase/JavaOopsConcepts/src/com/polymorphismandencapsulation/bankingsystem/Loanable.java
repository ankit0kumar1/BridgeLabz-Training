package com.polymorphismandencapsulation.bankingsystem;

public interface Loanable {

	// Apply for loan
	void applyForLoan(double loanAmount);

	// Calculate loan eligibility
	boolean calculateLoanEligibility();
}
