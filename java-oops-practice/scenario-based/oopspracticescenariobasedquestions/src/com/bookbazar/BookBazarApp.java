package com.bookbazar;

public class BookBazarApp {

    public static void main(String[] args) {

        Book ebook = new EBook("Atomic Habits", "James Clear", 500, 50);
        Book printedBook = new PrintedBook("Clean Code", "Robert C. Martin", 800, 30);

        Order order1 = new Order("Ankit", ebook, 2);
        Order order2 = new Order("Ankit", printedBook, 1);

        order1.placeOrder();
        order2.placeOrder();

        System.out.println("EBook Order Total: ₹" + order1.calculateTotal());
        System.out.println("Printed Book Order Total: ₹" + order2.calculateTotal());
        System.out.println("Order Status: " + order1.getStatus());
    }
}
