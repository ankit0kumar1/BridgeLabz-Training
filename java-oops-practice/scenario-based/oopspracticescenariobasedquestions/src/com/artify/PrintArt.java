package com.artify;

public class PrintArt extends ArtWork{

	public PrintArt(String title, String artist, double price) {
		super(title, artist, price);
		
	}

	@Override
	public void applyLicense() {
		licenseType = "Personal / Commercial";
		System.out.println("Print license applied: resale allowed.");
	}
	
	
}
