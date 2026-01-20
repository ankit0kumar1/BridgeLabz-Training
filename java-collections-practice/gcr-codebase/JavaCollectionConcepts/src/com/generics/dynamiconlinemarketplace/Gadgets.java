package com.generics.dynamiconlinemarketplace;

public class Gadgets extends Product{

	public Gadgets(String name, double price) {
		super(name, price);
	}

	@Override
	public String getCategory() {
		return "Gadgets";
	}

}
