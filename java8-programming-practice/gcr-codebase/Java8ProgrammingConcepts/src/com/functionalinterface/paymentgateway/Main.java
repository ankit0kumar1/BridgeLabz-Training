package com.functionalinterface.paymentgateway;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor upi = new UpiProcessor();
        PaymentProcessor wallet = new WalletProcessor();
        PaymentProcessor card = new CreditCardProcessor();

        upi.pay(500);
        upi.refund(200);

        wallet.pay(1000);
        wallet.refund(100);

        card.pay(2000);
        card.refund(500);
    }
}
