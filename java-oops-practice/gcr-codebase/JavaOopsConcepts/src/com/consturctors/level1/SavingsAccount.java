package com.consturctors.level1;

class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double interestRate) {
        super(accountNumber, accountHolder, 0.0);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);   // public → allowed
        System.out.println("Account Holder: " + accountHolder);   // protected → allowed
        System.out.println("Balance: " + getBalance());           // private → via getter
        System.out.println("Interest Rate: " + interestRate);
    }
}
