package com.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine{

	public Syrup(String name, double price, LocalDate expiryDate) {
		super(name, price, expiryDate);
		
	}

	@Override
	public boolean checkExpiry() {
		//Syrups are unsafe to drink 5days before expiry date
		return LocalDate.now().isAfter(expiryDate.minusDays(5)); 
	}

}
