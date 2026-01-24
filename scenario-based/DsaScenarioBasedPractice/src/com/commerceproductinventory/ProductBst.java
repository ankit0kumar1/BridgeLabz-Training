package com.commerceproductinventory;

public class ProductBst {
	ProductNode root;
	
	//Insert Product 
	public void insert(int sku, String productName, double price) {
		root = insertRecord(root, sku, productName, price);
		
	}
	private ProductNode insertRecord(ProductNode root,int sku,String productName,double price) {
		if(root == null) {
			return new ProductNode(sku, productName,price);
		}
		//go left
		if(sku < root.sku) {
			root.left =insertRecord(root.left, sku, productName, price);
		//go right
		}else if(sku> root.sku) {
			root.right =insertRecord(root.right, sku, productName,price);
		}
		return root;
	}
	
	//search by sku
	public ProductNode search(int sku) {
		System.out.println("\nSearch operation performed");
		return searchRecord(root,sku);
		
	}
	private ProductNode searchRecord(ProductNode root,int sku) {
		if(root == null || root.sku == sku) {
			return root;
		}
		if(sku < root.sku) {
			return searchRecord(root.left, sku);
		}else {
			return searchRecord(root.right, sku);
		}
		
	}
	
	public void display() {
		displayInorder(root);
		
	}
	private  void displayInorder(ProductNode root) {
		if(root!= null) {
			displayInorder(root.left);
			System.out.println("SKU" + root.sku + " Product Name: " + root.productName + " Price: " + root.price);
			displayInorder(root.right);
		}
	}
	
	public boolean updatePrice(int sku, double newPrice) {
		ProductNode node= searchRecord(root, sku);
		if(node == null) {
			return false;
		}
		node.price = newPrice;
		return true;
	}
	
}
