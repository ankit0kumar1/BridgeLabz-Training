package com.loanbuddy;

public class PersonalLoan extends LoanApplication {
	public PersonalLoan(double term, Applicant applicant) {
		super("Personal Loan", term, 12, applicant);

	}

	@Override
	public double calculateEMI() {
		double p = applicant.getLoanAmount();
		double r = intrestRate / (12 * 100); // monthly interest rate
		double n = term; // number of months

		double emi = (p * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);

		return emi;
	}

	
	
	@Override
	public void approveLoan() {
		if (applicant.getIncome() < 40000 && applicant.getCreditScore() < 750) {
			System.out.println("Not approved");
		} else {
			System.out.println("Loan approved");
		}

	}
}
