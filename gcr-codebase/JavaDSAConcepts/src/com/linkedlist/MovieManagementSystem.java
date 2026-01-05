package com.linkedlist;

public class MovieManagementSystem {
    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtEnd("Joker", "Todd Phillips", 2019, 8.5);

        movies.addAtPosition(2, "Tenet", "Christopher Nolan", 2020, 7.4);

        movies.displayForward();

        System.out.println();
        movies.displayReverse();

        System.out.println();
        movies.searchByDirector("Christopher Nolan");

        movies.updateRating("Tenet", 7.8);

        movies.removeByTitle("Joker");

        System.out.println("\nAfter Updates:");
        movies.displayForward();
    }
}

