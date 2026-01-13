package com.smartcheckout;

import java.util.Scanner;

public class SmartCheckoutApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		SmartCheckout checkout = new SmartCheckout();
		checkout.addItemCatalog(new Item("101", "Oil", 140, 20));
        checkout.addItemCatalog(new Item("102", "Maggie", 80, 15));
        checkout.addItemCatalog(new Item("103", "Eggs", 6, 100));
		
		Customer c1 = new Customer(1, "Anni");
		Customer c2 = new Customer(2, "Ankit");
		
		c1.addItems("101", 4);
		c1.addItems("102", 4);
		c1.addItems("103", 30);
		
		c2.addItems("101", 8);
		c2.addItems("102", 4);
		c2.addItems("556", 12);
		
		checkout.addCustomer(c2);
		checkout.addCustomer(c1);
		
		checkout.processCheckout();
		checkout.processCheckout();
		
		
		
	}
}
