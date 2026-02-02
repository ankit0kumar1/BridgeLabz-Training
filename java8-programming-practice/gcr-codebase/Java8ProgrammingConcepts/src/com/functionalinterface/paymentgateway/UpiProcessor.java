package com.functionalinterface.paymentgateway;

class UpiProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}