package com.commerceproductinventory;

public class ProductInventory {
	public static void main(String[] args) {
		ProductBst products = new ProductBst();
		//insert
		products.insert(201, "Laptop", 50000);
		products.insert(125, "SmartPhone", 14000);
		products.insert(204, "SmartWatch", 2000);
		products.insert(329, "Iphone", 75000);
		//display
		products.display();
		//search
		System.out.println(products.search(204));
		//update
		products.updatePrice(204, 5000);
		products.display();
		
	}

}
