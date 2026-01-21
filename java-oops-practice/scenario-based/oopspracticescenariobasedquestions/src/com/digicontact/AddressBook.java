package com.digicontact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressBook {
	
    private ArrayList<Contact> contacts = new ArrayList<>();

    //add Contact with duplicate validation
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(contact.getFirstName()) &&
                c.getLastName().equalsIgnoreCase(contact.getLastName())) {
                System.out.println("Duplicate contact not allowed!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("contact added successfully.");
    }

    //edit Contact
    public void editContact(String firstName, String lastName,String newPhone, String newEmail, Address newAddress) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName) &&
                c.getLastName().equalsIgnoreCase(lastName)) {
                c.setPhone(newPhone);
                c.setEmail(newEmail);
                c.setAddress(newAddress);
                System.out.println("contact updated.");
                return;
            }
        }
        System.out.println("contact not found.");
    }

    //delete Contact
    public void deleteContact(String firstName, String lastName) {
        contacts.removeIf(c ->
            c.getFirstName().equalsIgnoreCase(firstName) &&
            c.getLastName().equalsIgnoreCase(lastName));
        System.out.println("contact deleted (if existed).");
    }
    //search by City or State
    public void searchByCityOrState(String value) {
        for (Contact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {
                System.out.println(c);
            }
        }
    }
    //display Sorted Contacts
    public void displaySortedContacts() {
        Collections.sort(contacts, Comparator.comparing(Contact::getFirstName));
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
