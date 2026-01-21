package com.resumescreeningsystem;

class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void screen() {
        System.out.println("Screening product sense, communication, strategy");
    }
}