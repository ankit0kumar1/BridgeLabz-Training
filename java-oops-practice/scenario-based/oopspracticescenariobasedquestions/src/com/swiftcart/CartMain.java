package com.swiftcart;

import java.util.Scanner;

public class CartMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.println("🛒 Welcome to SwiftCart");

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Checkout");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {

                System.out.print("Enter product name: ");
                String name = sc.nextLine();

                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter category: ");
                String category = sc.nextLine();

                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                System.out.println("Product Type:");
                System.out.println("1. Perishable");
                System.out.println("2. Non-Perishable");
                System.out.print("Choose type: ");
                int type = sc.nextInt();

                Product product;

                if (type == 1) {
                    System.out.print("Enter expiry days: ");
                    int expiryDays = sc.nextInt();
                    product = new PerishableProduct(name, price, category, expiryDays);
                } else {
                    product = new NonPerishableProduct(name, price, category);
                }

                cart.addProduct(product, quantity);
                System.out.println("✅ Product added to cart.");

            } 
            else if (choice == 2) {

                System.out.print("Enter coupon discount amount: ");
                double coupon = sc.nextDouble();

                cart.applyDiscount(coupon);
                cart.generateBill();
                break;

            } 
            else if (choice == 3) {
                System.out.println("👋 Thank you for using SwiftCart");
                break;
            } 
            else {
                System.out.println("❌ Invalid choice");
            }
        }

        sc.close();
    }
}


