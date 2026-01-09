package com.medistore;

import java.time.LocalDate;

public class Injections extends Medicine{

	public Injections(String name, double price, LocalDate expiryDate) {
		super(name, price, expiryDate);
		
	}

	@Override
	public boolean checkExpiry() {
		//injections are unsafe 10 days before expiry date
		return LocalDate.now().isAfter(expiryDate.minusDays(10)); 
	}

}
