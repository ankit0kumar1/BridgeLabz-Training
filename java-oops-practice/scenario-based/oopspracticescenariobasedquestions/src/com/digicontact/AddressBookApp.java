package com.digicontact;

public class AddressBookApp {
    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        Address addr1 = new Address("Indore", "MP", "452001");
        Address addr2 = new Address("Bhopal", "MP", "462001");

        Contact c1 = new Contact("Ankit", "Kumar",
                "9844544555", "ankit@gmail.com", addr1);

        Contact c2 = new Contact("Rahul", "Sharma",
                "91245415454", "rahul@gmail.com", addr2);

        book.addContact(c1);
        book.addContact(c2);

        System.out.println("\n-- Sorted Contacts ---");
        book.displaySortedContacts();

        System.out.println("\n--- Search by City: indore --");
        book.searchByCityOrState("Indore");

        book.editContact("Ankit", "Kumar",
                "999945545545", "ankit@gmail.com",
                new Address("Delhi", "Delhi", "110001"));

        book.deleteContact("Rahul", "sharma");
    }
}
	
