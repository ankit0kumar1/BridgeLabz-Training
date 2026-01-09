package com.medistore;

import java.util.*;
import java.time.LocalDate;

public class MediStoreApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("===== Welcome to Medi Store =====");
		
		System.out.println("Enter the name of Medicine");
		String name = input.nextLine();
		
		System.out.println("Choose the type of medicine (1. Tablet 2. Syrup 3. Injection)");
		int choose = input.nextInt();
		
		System.out.print("Enter Price per Unit: ");
        double price = input.nextDouble();
        
        System.out.println("Enter Expiry Date (yyyy-mm-dd): ");
        LocalDate expiryDate = LocalDate.parse(input.next());
		
        System.out.println("Enter the quantity to sell: ");
        int quantity = input.nextInt();
		
		
		 Medicine medicine = null;
		if(choose ==1) {
			 medicine = new Tablet(name, price, expiryDate);
		}else if(choose ==2) {
			 medicine = new Tablet(name, price, expiryDate);
		}else if(choose ==3) {
			 medicine = new Tablet(name, price, expiryDate);
		}else {
			System.out.println("Invalid medicine type!");
		}
		
		double billAmount = medicine.sell(quantity);
		
		if(billAmount> 0) {
			System.out.println("Medicine sold successfully!");
			System.out.println("Total Amount: ₹" + billAmount);
		}else {
			System.out.println("Failed");
		}
		
		System.out.println("====== Thank You for using MediStore =====");
		
		
		
	}

}
