package com.functionalinterface.paymentgateway;

public interface PaymentProcessor {
	void pay(double amount);
	
	default void refund(double amount) {
		System.out.println("Refund not supported by this provider. Amount: ₹" +amount);
	}
}
