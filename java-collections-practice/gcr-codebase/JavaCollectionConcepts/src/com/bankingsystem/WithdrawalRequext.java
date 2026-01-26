package com.bankingsystem;

class WithdrawalRequest {
    long accountNumber;
    double amount;

    public WithdrawalRequest(long accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
}
