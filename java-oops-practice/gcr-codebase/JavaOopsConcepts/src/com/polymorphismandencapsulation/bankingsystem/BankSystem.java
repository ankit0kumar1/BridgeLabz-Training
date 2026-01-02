package com.polymorphismandencapsulation.bankingsystem;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate polymorphism
public class BankSystem {

	public static void main(String[] args) {

		// List of BankAccount references (Polymorphism)
		List<BankAccount> accounts = new ArrayList<>();

		BankAccount acc1 = new SavingsAccount("SB1001", "Vikash", 50000);
		BankAccount acc2 = new CurrentAccount("CA2001", "Rahul", 80000);

		accounts.add(acc1);
		accounts.add(acc2);

		// Processing different account types dynamically
		for (BankAccount acc : accounts) {

			System.out.println("Account Number : " + acc.getAccountNumber());
			System.out.println("Holder Name    : " + acc.getHolderName());
			System.out.println("Interest Earned: " + acc.calculateInterest());

			Loanable loan = (Loanable) acc;
			loan.applyForLoan(30000);
			System.out.println("Loan Eligible  : " + loan.calculateLoanEligibility());

			System.out.println("----------------------------------");
		}
	}
}
