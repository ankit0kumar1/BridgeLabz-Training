package com.bankingsystem;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction implements Runnable{
	private BankAccount account;
	private String customerName;
	private int amount;
	
	
	public Transaction(BankAccount account, String customerName, int amount) {
		this.account = account;
		this.customerName = customerName;
		this.amount = amount;
	}


	@Override
	public void run() {
		System.out.println("[" + Thread.currentThread().getName() +"] Attempting to withdraw amount " + amount);
		boolean sucess = account.withdraw(amount);
		
		if(sucess) {
			System.out.println("Transaction successful: " + customerName + ", Amount: " + amount + ", Balance: "+account.getBalance() + ", Time: " +LocalDateTime.now() );
		}else {
			System.out.println("Transaction Failed: " + customerName + ", Amount: " + amount +", Insufficient Balance, Time: " + LocalDateTime.now());
		}
	}

}
