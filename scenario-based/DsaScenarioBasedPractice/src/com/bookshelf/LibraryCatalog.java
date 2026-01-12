package com.bookshelf;

import java.util.*;

public class LibraryCatalog {

    // genre → list of books
    private Map<String, LinkedList<Book>> catalog;

    // optional: prevent duplicate titles
    private Set<String> bookRegistry;

    public LibraryCatalog() {
        catalog = new HashMap<>();
        bookRegistry = new HashSet<>();
    }

    // Add a book to a genre
    public void addBook(String genre, Book book) {

        if (bookRegistry.contains(book.getTitle())) {
            System.out.println("Duplicate book not allowed: " + book.getTitle());
            return;
        }

        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);

        bookRegistry.add(book.getTitle());
        System.out.println("Added: " + book);
    }

    // Borrow (remove) a book
    public void borrowBook(String genre, String title) {

        LinkedList<Book> books = catalog.get(genre);
        if (books == null) {
            System.out.println("Genre not found.");
            return;
        }

        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (book.getTitle().equals(title)) {
                it.remove();          // O(1) removal
                bookRegistry.remove(title);
                System.out.println("Borrowed: " + book);
                return;
            }
        }

        System.out.println("Book not found.");
    }

    // Display catalog
    public void showCatalog() {
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  - " + book);
            }
        }
    }
}
