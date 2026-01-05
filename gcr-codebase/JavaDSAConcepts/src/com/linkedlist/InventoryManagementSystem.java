package com.linkedlist;

public class InventoryManagementSystem {
    public static void main(String[] args) {

        ItemLinkedList inventory = new ItemLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 60000);
        inventory.addAtEnd(102, "Mouse", 50, 500);
        inventory.addAtBeginning(103, "Keyboard", 30, 1500);
        inventory.addAtPosition(2, 104, "Monitor", 10, 12000);

        System.out.println("Initial Inventory:");
        inventory.displayAll();

        inventory.updateQuantity(102, 45);
        inventory.searchByItemName("Laptop");

        inventory.calculateTotalValue();

        System.out.println("\nSorted by Name (Ascending):");
        inventory.sortByName(true);
        inventory.displayAll();

        System.out.println("\nSorted by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.displayAll();
    }
}

