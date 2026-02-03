package com.streamapi.insuranceclaim;

public class Claim {
	private int claimId;
	private String claimType;
	private double amount;
	
	public Claim(int claimId, String claimType, double amount) {
		this.claimId = claimId;
		this.claimType = claimType;
		this.amount = amount;
	}

	public int getClaimId() {
		return claimId;
	}

	public String getClaimType() {
		return claimType;
	}

	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return claimId + " | Type: " + claimType +" | Amount: " + amount ;
		
	}
}
