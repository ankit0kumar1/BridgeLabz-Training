package com.loanbuddy;

public class HomeLoan extends LoanApplication {

	

	public HomeLoan(double term, Applicant applicant) {
		super("HomeLoan", term, 6, applicant);

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
		if(applicant.getCreditScore()<700 ) {
			System.out.println("Your loan cannot be approved.\nLow Credit score.\nBetter Luck Next Time");
		}else {
			System.out.println("Loan Approved");
		}
		
	}

	

}
