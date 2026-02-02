package com.functionalinterface.paymentgateway;

class WalletProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
}