package com.lambda.customsorting;

import java.util.*;

public class EcommerceSorting {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Phone", 15000, 4.5, 20));
        products.add(new Product(102, "Laptop", 55000, 4.8, 10));
        products.add(new Product(103, "Headphones", 2000, 4.2, 40));
        products.add(new Product(104, "Smart Watch", 3000, 4.0, 30));

        String campaign = "DISCOUNT"; // PRICE / RATING / DISCOUNT

        Comparator<Product> comparator = switch (campaign) {
            case "PRICE" -> (p1, p2) -> Double.compare(p1.price, p2.price);
            case "RATING" -> (p1, p2) -> Double.compare(p2.rating, p1.rating); // high to low
            case "DISCOUNT" -> (p1, p2) -> Double.compare(p2.discount, p1.discount); // high to low
            default -> (p1, p2) -> 0;
        };

        products.sort(comparator);

        System.out.println("Sorted by Campaign: " + campaign);
        products.forEach(System.out::println);
    }
}
