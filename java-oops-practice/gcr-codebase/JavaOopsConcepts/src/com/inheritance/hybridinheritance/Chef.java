package com.inheritance.hybridinheritance;

public class Chef extends Person implements Worker{

	public Chef(String name, int id) {
		super(name, id);
	}

	@Override
	public void performDuties() {
		System.out.println("Duties: Preparing meals and Managing Kitchen.");
		
	}
	 public void displayRole() {
	        System.out.println("Role: Chef");
	        displayPersonInfo();
	        performDuties();
	        System.out.println("---------------------------");
	    }
	
	
}
