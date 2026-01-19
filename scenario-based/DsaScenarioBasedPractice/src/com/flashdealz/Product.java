package com.flashdealz;

class Product {
    String productId;
    String name;
    int discount; // percentage

    Product(String productId, String name, int discount) {
        this.productId = productId;
        this.name = name;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " (" + discount + "% off)";
    }
}

