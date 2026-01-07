package com.petpal;

public class Dog extends Pet {

	// Constructor with name and age
	public Dog(String name, int age) {
		super(name, "Dog", age);
	}

	@Override
	public void makeSound() {
		System.out.println("Woof! Woof!");
	}
}
