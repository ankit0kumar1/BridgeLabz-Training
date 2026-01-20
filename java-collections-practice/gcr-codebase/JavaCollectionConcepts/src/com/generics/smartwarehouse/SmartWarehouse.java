package com.generics.smartwarehouse;

public class SmartWarehouse {
	public static void main(String[] args) {
		
		Storage<Electronics> electronicsStorage = new Storage<>();
		electronicsStorage.addItem(new Electronics("Laptop"));
		electronicsStorage.addItem(new Electronics("Smartphone"));
		
		Storage<Groceries> groceriesStorage = new Storage<>();
		groceriesStorage.addItem(new Groceries("Rice"));
		groceriesStorage.addItem(new Groceries("Milk"));
		
		Storage<Furniture> furnitureStorage = new Storage<>();
		furnitureStorage.addItem(new Furniture("Chair"));
		furnitureStorage.addItem(new Furniture("Table"));
		
		System.out.println("=== Electronics ===");
		WarehouseUtility.displayItems(electronicsStorage.getItems());
		
		System.out.println("\n=== Groceries ===");
		WarehouseUtility.displayItems(groceriesStorage.getItems());
		
		System.out.println("\n=== Furniture ===");
		WarehouseUtility.displayItems(furnitureStorage.getItems());
	
	}
}
