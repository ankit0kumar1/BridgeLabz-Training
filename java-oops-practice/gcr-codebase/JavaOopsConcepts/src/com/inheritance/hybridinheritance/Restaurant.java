package com.inheritance.hybridinheritance;

public class Restaurant {
	public static void main(String[] args) {

        Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Amit", 202);

        chef.displayRole();
        waiter.displayRole();
    }
}
