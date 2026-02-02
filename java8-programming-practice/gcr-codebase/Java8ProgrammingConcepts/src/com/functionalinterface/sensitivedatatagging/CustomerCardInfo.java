package com.functionalinterface.sensitivedatatagging;

class CustomerCardInfo implements SensitiveData {
    private String cardNumber;
    private String cvv;

    public CustomerCardInfo(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    @Override
    public String toString() {
        return "CustomerCardInfo{cardNumber='" + cardNumber + "', cvv='" + cvv + "'}";
    }
}