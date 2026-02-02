package com.methodreference.constructorreference;

class Invoice {
    String transactionId;

    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{transactionId='" + transactionId + "'}";
    }
}

