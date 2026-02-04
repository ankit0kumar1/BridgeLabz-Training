package com.collectors.librarybooks;

import java.util.*;
import java.util.stream.*;
public class Main {
	public static void main(String[] args) {
		 List<Book> books = Arrays.asList(
	                new Book("Atomic Habits", "SelfHelp", 320),
	                new Book("Deep Work", "SelfHelp", 280),
	                new Book("Harry Potter", "Fantasy", 500),
	                new Book("Hobbit", "Fantasy", 310),
	                new Book("Rich Dad Poor Dad", "Finance", 240)
	        );
		 Map<String, IntSummaryStatistics> statsByGenre = books.stream()
				 .collect(Collectors.groupingBy(Book::getGenre,
						 Collectors.summarizingInt(Book::getPages)));
						 
		statsByGenre.forEach((genre ,stats ) -> {
			System.out.println("Genre: " + genre);
			System.out.println(" Total Pages: " +  stats.getSum());
			System.out.println(" Average Pages : " +stats.getAverage());
			System.out.println(" Max Pages: " + stats.getMax());
			System.out.println();
		});
	}
}
