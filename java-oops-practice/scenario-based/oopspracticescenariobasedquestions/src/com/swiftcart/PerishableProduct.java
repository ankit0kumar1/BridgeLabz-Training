package com.swiftcart;

public class PerishableProduct extends Product {
    private int expiryDays;

    public PerishableProduct(String name, double price, String category, int expiryDays) {
        super(name, price, category);
        this.expiryDays = expiryDays;
    }

    @Override
    public double getDiscount() {
        if (expiryDays <= 2) {
            return getPrice() * 0.30; // 30% discount
        }
        return getPrice() * 0.10; // 10% discount
    }
}

