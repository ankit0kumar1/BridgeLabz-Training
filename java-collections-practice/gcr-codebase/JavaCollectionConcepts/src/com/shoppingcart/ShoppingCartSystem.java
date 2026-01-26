package com.shoppingcart;

import java.util.*;

public class ShoppingCartSystem {

    // HashMap: product -> price (fast lookup)
    private Map<String, Double> priceMap = new HashMap<>();

    // LinkedHashMap: product -> quantity (keeps insertion order of cart items)
    private Map<String, Integer> cart = new LinkedHashMap<>();

    // Add products into price list
    public void addProduct(String product, double price) {
        priceMap.put(product, price);
    }

    // Add item to cart
    public void addToCart(String product, int quantity) {
        if (!priceMap.containsKey(product)) {
            System.out.println("Product not found: " + product);
            return;
        }
        cart.put(product, cart.getOrDefault(product, 0) + quantity);
    }

    // Display cart in insertion order
    public void displayCartInOrder() {
        System.out.println("\n--- Cart Items (Added Order - LinkedHashMap) ---");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int qty = entry.getValue();
            double price = priceMap.get(product);

            System.out.println(product + " | Qty: " + qty + " | Price: " + price);
        }
    }

    // Display cart sorted by price using TreeMap
    public void displayCartSortedByPrice() {
        System.out.println("\n--- Cart Items (Sorted by Price - TreeMap) ---");

        // TreeMap: price -> list of products (because multiple products can have same price)
        Map<Double, List<String>> sortedByPrice = new TreeMap<>();

        for (String product : cart.keySet()) {
            double price = priceMap.get(product);
            sortedByPrice.computeIfAbsent(price, p -> new ArrayList<>()).add(product);
        }

        for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
            double price = entry.getKey();
            for (String product : entry.getValue()) {
                int qty = cart.get(product);
                System.out.println(product + " | Qty: " + qty + " | Price: " + price);
            }
        }
    }

    // Total Bill
    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int qty = entry.getValue();
            total += priceMap.get(product) * qty;
        }
        return total;
    }

    public static void main(String[] args) {

        ShoppingCartSystem shop = new ShoppingCartSystem();

        // Add products (HashMap)
        shop.addProduct("Laptop", 60000);
        shop.addProduct("Mouse", 500);
        shop.addProduct("Keyboard", 1200);
        shop.addProduct("Headphones", 1200);

        // Add to cart (LinkedHashMap keeps order)
        shop.addToCart("Mouse", 2);
        shop.addToCart("Laptop", 1);
        shop.addToCart("Keyboard", 1);
        shop.addToCart("Headphones", 1);

        shop.displayCartInOrder();
        shop.displayCartSortedByPrice();

        System.out.println("\nTotal Bill = " + shop.calculateTotal());
    }
}
