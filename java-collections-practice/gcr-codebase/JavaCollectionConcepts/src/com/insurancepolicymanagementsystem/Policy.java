package com.insurancepolicymanagementsystem;


import java.time.*;
public class Policy {
	private String policyNumber;
	private String policyHolderName;
	private LocalDate expiryDate;
	private String coverageType; // Health, Auto, Home
	private double premiumAmount;
	
	public Policy(String policyNumber, String policyHolderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
		this.policyNumber =policyNumber;
		this.policyHolderName =policyHolderName;
		this.expiryDate = expiryDate;
		this.coverageType= coverageType;
		this.premiumAmount =premiumAmount;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public String getCoverageType() {
		return coverageType;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Policy)) return false;
		Policy other = (Policy)obj;
		return this.policyNumber.equals(other.policyNumber);
	}
	@Override
	public int hashCode() {
		return policyNumber.hashCode();
	}
	 @Override
	    public String toString() {
	        return "Policy{" +
	                "policyNumber='" + policyNumber + '\'' +
	                ", holder='" + policyHolderName + '\'' +
	                ", expiryDate=" + expiryDate +
	                ", coverageType='" + coverageType + '\'' +
	                ", premium=" + premiumAmount +
	                '}';
	    }
}
