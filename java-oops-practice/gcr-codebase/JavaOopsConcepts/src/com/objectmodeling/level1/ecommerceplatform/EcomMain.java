package com.objectmodeling.level1.ecommerceplatform;

public class EcomMain {
	  public static void main(String[] args) {

	        // Independent products
	        Product p1 = new Product(1, "Laptop", 60000);
	        Product p2 = new Product(2, "Mouse", 500);
	        Product p3 = new Product(3, "Keyboard", 1500);

	        // Create customer
	        Customer c1 = new Customer(101, "Rohan");
	        // Create order
	        Order order1 = new Order(1001);
	        // Add products to order
	        order1.addProduct(p1);
	        order1.addProduct(p2);
	        order1.addProduct(p3);
	        // Customer places order (communication)
	        c1.placeOrder(order1);

	        System.out.println();
	        c1.showOrders();
	    }
}
