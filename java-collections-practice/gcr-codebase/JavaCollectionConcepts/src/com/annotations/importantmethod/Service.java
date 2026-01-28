package com.annotations.importantmethod;

public class Service {

    @ImportantMethod
    public void paymentProcess() {
        System.out.println("Payment is processing...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void generateInvoice() {
        System.out.println("Invoice generated...");
    }

    public void normalLog() {
        System.out.println("This is a normal method (not important).");
    }
}

