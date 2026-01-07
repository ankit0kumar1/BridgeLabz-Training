package com.petpal;

public class Bird extends Pet {

	// Constructor with name and age
	public Bird(String name, int age) {
		super(name, "Bird", age);
	}

	@Override
	public void makeSound() {
		System.out.println("Chirp chirp!");
	}
}