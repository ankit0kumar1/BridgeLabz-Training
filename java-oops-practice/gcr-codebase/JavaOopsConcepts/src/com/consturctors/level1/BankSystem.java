package com.consturctors.level1;

public class BankSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(
                "ACC12345",
                "Ankit Kumar",
                4.5
        );

        savings.setBalance(25000);
        savings.displayDetails();
        System.out.println("Public Account Number: " + savings.accountNumber);
    }
}
