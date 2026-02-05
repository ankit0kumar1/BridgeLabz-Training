package com.studentlibrarysystem;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		LibraryCatalog catalog = LibraryCatalog.getInstance();

		Book book = new Book.BookBuilder("Data Structures").authors(Arrays.asList("Cormen")).edition("3rd")
				.genre("Computer Science").publisher("MIT Press").build();

		catalog.addBook(book);

		User u1 = UserFactory.createUser("student", "Anuj");
		User u2 = UserFactory.createUser("faculty", "Dr. Sharma");

		u1.getRole();
		u2.getRole();

		NotificationService service = new NotificationService();

		LibraryUser obs1 = new LibraryUser("Anuj");
		LibraryUser obs2 = new LibraryUser("Dr. Sharma");

		service.subscribe(obs1);
		service.subscribe(obs2);

		service.notifyUsers("Book 'Data Structures' is now available!");
	}
}
