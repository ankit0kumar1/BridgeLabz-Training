package com.objectmodeling.level1;

public class BankingSystem {
	public static void main(String [] args) {
		Bank sbi = new Bank("SBI");
		Customer c1 = new Customer("Ankit Kumar");
		Customer c2 = new Customer("Keshav Yadav");
		c1.setBank(sbi);
		
		c1.setBalance(1000);
		c2.setBalance(2500);
		c1.viewBalance();
		Customer c3 = new Customer("Sanchit");
		sbi.openAccount(c3);
		c3.viewBalance();
		c2.viewBalance();
	}
}
