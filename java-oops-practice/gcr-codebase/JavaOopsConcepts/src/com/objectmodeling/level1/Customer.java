package com.objectmodeling.level1;

public class Customer {
	private String customerName;
	private double balance;
	private Bank bank; // association with bank
	
	public Customer(String name) {
		this.customerName = name;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void viewBalance() {
		System.out.println("Customer Name: " + customerName);
		if(bank!=null) {
			System.out.println("Bank: " + bank.getBankName());
            System.out.println("Balance: ₹" + balance);
        } else {
            System.out.println("No bank account found.");
        }
		
		
	}
}
