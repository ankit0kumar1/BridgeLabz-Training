package com.swiftcart;

public interface ICheckout {
	public void generateBill();
	public void applyDiscount(double couponAmount);
}
