package com.functionalinterface.sensitivedatatagging;

public class Main {
    public static void main(String[] args) {

        CustomerCardInfo card = new CustomerCardInfo("1234-5678-9999-0000", "789");
        ProductInfo product = new ProductInfo("Laptop");

        EncryptionService.process(card);
        EncryptionService.process(product);
    }
}