package com.eventease;

public class User {

	private static int counter = 1;

	private final int userId;
	private String name;
	private String email;
	private String phone;

	public User(String name, String email, String phone) {
		this.userId = counter++;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
}
