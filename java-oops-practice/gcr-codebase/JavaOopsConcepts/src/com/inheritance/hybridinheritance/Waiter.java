package com.inheritance.hybridinheritance;

public class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Serving customers and taking orders.");
    }

    public void displayRole() {
        System.out.println("Role: Waiter");
        displayPersonInfo();
        performDuties();
        System.out.println("---------------------------");
    }
}

