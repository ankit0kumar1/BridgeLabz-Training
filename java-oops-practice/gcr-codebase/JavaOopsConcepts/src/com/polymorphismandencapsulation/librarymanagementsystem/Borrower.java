package com.polymorphismandencapsulation.librarymanagementsystem;

public class Borrower {
	private String name;
	private String contactNumber;
	
	public Borrower(String name, String contactNumber) {
		this.name = name;
		this.contactNumber = contactNumber;
	}
	public String getName() {
		return name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
}