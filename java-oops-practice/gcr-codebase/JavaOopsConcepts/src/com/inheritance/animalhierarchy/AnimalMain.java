package com.inheritance.animalhierarchy;

public class AnimalMain {
	public static void main(String[] args) {
		Dog dog = new Dog("Tommy", 6);
		Cat cat = new Cat("Kitty", 4);
		Bird bird = new Bird("Mighty", 8);

		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}
