package com.foodloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodLoopApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<FoodItem> cart = new ArrayList<>();

        System.out.println("===== Welcome to FoodLoop =====");

        System.out.print("How many items do you want to order? ");
        int itemCount = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < itemCount; i++) {

            System.out.println("\nItem " + (i + 1));

            System.out.print("Enter item type (Veg / NonVeg): ");
            String type = sc.nextLine();

            System.out.print("Enter item name: ");
            String name = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter stock available: ");
            int stock = sc.nextInt();
            sc.nextLine(); // consume newline

            FoodItem item;

            if (type.equalsIgnoreCase("Veg")) {
                item = new VegItem(name, price, stock);
            } else if (type.equalsIgnoreCase("NonVeg")) {
                item = new NonVegItem(name, price, stock);
            } else {
                System.out.println("Invalid item type. Skipping item.");
                continue;
            }

            if (item.isAvailable()) {
                cart.add(item);
            } else {
                System.out.println("Item out of stock, not added.");
            }
        }

        if (cart.isEmpty()) {
            System.out.println("\nNo items available to place order.");
            sc.close();
            return;
        }

        // Create order (combo meal)
        Order order = new Order(cart);

        // Place order
        System.out.println("\n--- Order Summary ---");
        order.placeOrder();

        // Cancel option
        System.out.print("\nDo you want to cancel the order? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            order.cancelOrder();
        }

        System.out.println("\n===== Thank you for using FoodLoop =====");
        sc.close();
    }
}

