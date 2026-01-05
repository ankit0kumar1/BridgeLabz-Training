package com.linkedlist;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtEnd(101, "Clean Code", "Robert Martin", "Programming", true);
        library.addAtEnd(102, "Effective Java", "Joshua Bloch", "Programming", true);
        library.addAtBeginning(103, "1984", "George Orwell", "Fiction", false);
        library.addAtPosition(2, 104, "The Alchemist", "Paulo Coelho", "Fiction", true);

        library.displayForward();

        System.out.println();
        library.displayReverse();

        System.out.println();
        library.searchByAuthor("Joshua Bloch");

        library.updateAvailability(103, true);

        library.removeByBookId(102);

        System.out.println("\nAfter Updates:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}
