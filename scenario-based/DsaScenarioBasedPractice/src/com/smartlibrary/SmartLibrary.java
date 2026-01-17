package com.smartlibrary;

class SmartLibrary {

    public static void insertionSort(Book[] books) {

        for (int i = 1; i < books.length; i++) {
            Book current = books[i];
            int j = i - 1;

            // Shift books that come after alphabetically
            while (j >= 0 && books[j].title.compareTo(current.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // Insert book at correct position
            books[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        Book[] borrowedBooks = {
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Computer Networks"),
            new Book("Operating Systems"),
            new Book("Database Systems")
        };

        insertionSort(borrowedBooks);

        System.out.println("Borrowed books (Alphabetical Order):");
        for (Book b : borrowedBooks) {
            System.out.println(b.title);
        }
    }
}
