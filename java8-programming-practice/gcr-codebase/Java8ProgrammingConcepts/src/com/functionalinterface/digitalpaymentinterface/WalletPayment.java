package com.functionalinterface.digitalpaymentinterface;

class WalletPayment implements DigitalPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet.");
    }
}
