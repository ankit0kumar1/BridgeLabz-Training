package com.objectmodeling.level1;

public class Bank {
	private String  bankName;
	
	//Constructor
	public Bank(String bankName){
		this.bankName = bankName;
		
	}
	// method to getBankName
	public String getBankName() {
	    return bankName;
	}

	//openAccount
	public void openAccount(Customer customer) {
		customer.setBank(this);
		customer.setBalance(1000);
		System.out.println("Account opened for " +customer.getCustomerName() + " in " + bankName);
		
		
	}
}
