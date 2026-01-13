package com.parceltracker;

public class Stage {
	Product product;
	String stageName;
	Stage next;
	
	public Stage(String stageName, Product product) {
		this.stageName = stageName;
		this.next = null;
		this.product = product;
	}
}
