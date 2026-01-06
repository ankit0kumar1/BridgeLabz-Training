package com.swiftcart;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price, String category) {
        super(name, price, category);
    }

    @Override
    public double getDiscount() {
        return getPrice() * 0.05; // Flat 5% discount
    }
}

