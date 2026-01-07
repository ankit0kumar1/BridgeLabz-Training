package com.loanbuddy;

public abstract class LoanApplication implements IApprovable{
	protected String loanType;
	protected double term;
	protected double intrestRate;

	protected Applicant applicant;
	public LoanApplication(String loanType, double term, double intrestRate, Applicant applicant) {
		this.loanType = loanType;
		this.term = term;
		this.intrestRate = intrestRate;
		this.applicant = applicant;
	}

	public abstract double calculateEMI();
	public abstract void approveLoan();

	public String getLoanType() {
		
		return loanType;
	}

	public double getTerm() {
		return term;
	}
	
}
