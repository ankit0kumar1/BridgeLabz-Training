package com.functionalinterface.digitalpaymentinterface;

public class Main {
    public static void main(String[] args) {

        DigitalPayment p1 = new UpiPayment();
        DigitalPayment p2 = new CreditCardPayment();
        DigitalPayment p3 = new WalletPayment();

        p1.pay(500);
        p2.pay(1200);
        p3.pay(250);
    }
}
