package com.consturctors.level1;

class BankAccount {

    public String accountNumber;
    protected String accountHolder;
    private double balance;
    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //method to get balance
    public double getBalance() {
        return balance;
    }

    // method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

