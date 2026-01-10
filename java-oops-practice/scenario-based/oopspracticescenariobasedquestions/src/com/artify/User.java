package com.artify;

public class User {
	private String name;
	private double walletBalance;
	
	public User(String name , double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	public double getBalance() {
		return walletBalance;
	}
	public void deductAmount(double amount) {
		if(walletBalance>= amount) {
			walletBalance -= amount;
		}else {
			System.out.println("Insufficient Balance");
		}
	}
}
