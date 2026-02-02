package com.functionalinterface.passwordstrengthvalidator;

public class Main {
	public static void main(String[] args) {
		String pass1 = "Ankit@123";
		String pass2 = "ankit@123";
		
		System.out.println(pass1 + " => " + SecurityUtils.isStrongPassword(pass1));
		System.out.println(pass2 + " => " + SecurityUtils.isStrongPassword(pass2));
	}
}
