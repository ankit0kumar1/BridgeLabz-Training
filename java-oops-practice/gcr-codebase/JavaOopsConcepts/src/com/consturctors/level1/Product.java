package com.consturctors.level1;

public class Product {
	 // instance variables
		private String productName;
		private double price;
		
		//class variable
		private static int totalProduct = 0;
		
		private void displayProductDetails(){
			System.out.println("The name of product name is: "+productName + " and the price is: Rs "
								+ price);
		}
		
		public static void displayTotalProducts() {
			System.out.println("The number of product is: "+totalProduct);
		}
		
		Product(String productName , double price){
			this.productName = productName;
			this.price = price;
			totalProduct++;
		}
		
		public static void main(String[] args) {
			
			Product p1 = new Product("Laptop",30000);
			Product p2 = new Product("SmartPhone",12000);
			// Display individual product details
	        p1.displayProductDetails();
	        System.out.println();
	        p2.displayProductDetails();
	        System.out.println();
	        
	        // Display total number of products
	        Product.displayTotalProducts();
		}
}
