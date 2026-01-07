package com.petpal;

public class Cat extends Pet {

	// Constructor with name and age
	public Cat(String name, int age) {
		super(name, "Cat", age);
	}

	@Override
	public void makeSound() {
		System.out.println("Meoww");
	}
}
