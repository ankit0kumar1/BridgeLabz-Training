package com.swiftcart;

import java.util.*;

public class Cart implements ICheckout {

    private List<Product> products;
    private Map<Product, Integer> quantities;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
        quantities = new HashMap<>();
        totalPrice = 0.0;
    }

    public Cart(List<Product> initialProducts) {
        this();
        for (Product p : initialProducts) {
            addProduct(p, 1);
        }
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        quantities.put(product, quantity);
        calculateTotal();
    }

    public void removeProduct(Product product) {
        products.remove(product);
        quantities.remove(product);
        calculateTotal();
    }

    // Only Cart can touch totalPrice
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            int qty = quantities.get(p);
            totalPrice += p.getPrice() * qty;
        }
    }

    @Override
    public void applyDiscount(double couponAmount) {
        double productDiscount = 0;

        for (Product p : products) {
            int qty = quantities.get(p);
            productDiscount += p.getDiscount() * qty;
        }

        totalPrice = totalPrice - productDiscount - couponAmount;

        if (totalPrice < 0) {
            totalPrice = 0;
        }
    }

    @Override
    public void generateBill() {
        System.out.println("------ SwiftCart Bill ------");
        for (Product p : products) {
            int qty = quantities.get(p);
            System.out.println(
                p.getName() + " x " + qty + " = ₹" + (p.getPrice() * qty)
            );
        }
        System.out.println("----------------------------");
        System.out.println("Final Amount: ₹" + totalPrice);
    }
}
