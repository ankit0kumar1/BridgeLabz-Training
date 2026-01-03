package com.objectmodeling.level1.ecommerceplatform;

import java.util.*;
public class Order {

    private int orderId;
    // Aggregation: Order contains products
    private List<Product> products;
    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }
    // Add product to order
    public void addProduct(Product product) {
        products.add(product);
    }
    // Display products in the order
    public void showProducts() {
        System.out.println("Products in Order ID: " + orderId);
        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " ₹" + p.getPrice());
        }
    }
    // Calculate total bill
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }
}
