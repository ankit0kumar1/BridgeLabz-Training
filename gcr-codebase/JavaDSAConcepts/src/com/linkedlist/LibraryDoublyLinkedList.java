package com.linkedlist;

class LibraryDoublyLinkedList {

    private BookNode head;
    private BookNode tail;

    /* ================= ADD ================= */

    // Add at Beginning
    public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at End
    public void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at Specific Position (1-based)
    public void addAtPosition(int position, int id, String title, String author, String genre, boolean available) {
        if (position <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            addAtBeginning(id, title, author, genre, available);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        if (temp.next == null) {
            addAtEnd(id, title, author, genre, available);
            return;
        }

        BookNode newNode = new BookNode(id, title, author, genre, available);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    /* ================= REMOVE ================= */

    public void removeByBookId(int bookId) {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Book removed successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    /* ================= SEARCH ================= */

    public void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    public void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found for this author");
        }
    }

    /* ================= UPDATE ================= */

    public void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = status;
                System.out.println("Availability status updated");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    /* ================= DISPLAY ================= */

    public void displayForward() {
        if (head == null) {
            System.out.println("Library is empty");
            return;
        }

        System.out.println("Books (Forward Order):");
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        if (tail == null) {
            System.out.println("Library is empty");
            return;
        }

        System.out.println("Books (Reverse Order):");
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    /* ================= COUNT ================= */

    public int countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /* ================= HELPER ================= */

    private void displayBook(BookNode book) {
        System.out.println(
            "ID: " + book.bookId +
            ", Title: " + book.title +
            ", Author: " + book.author +
            ", Genre: " + book.genre +
            ", Available: " + (book.isAvailable ? "Yes" : "No")
        );
    }
}

