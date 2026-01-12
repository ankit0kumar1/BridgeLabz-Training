package com.bookshelf;

public class BookShelfApp {

    public static void main(String[] args) {

        LibraryCatalog library = new LibraryCatalog();

        library.addBook("Fiction", new Book("1984", "George Orwell"));
        library.addBook("Fiction", new Book("Brave New World", "Aldous Huxley"));
        library.addBook("Science", new Book("A Brief History of Time", "Stephen Hawking"));

        library.showCatalog();

        library.borrowBook("Fiction", "1984");

        library.showCatalog();
    }
}
