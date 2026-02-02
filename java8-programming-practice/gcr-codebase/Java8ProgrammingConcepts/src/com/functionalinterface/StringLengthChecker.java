package com.functionalinterface;

import java.util.function.Function;

public class StringLengthChecker {
	public static void main(String[] args) {
		int limit =20;
		Function<String, Integer> lengthFinder = msg -> msg.length();
		String message = "hello this is Ankit Kumar";
		int length = lengthFinder.apply(message);
		System.out.println("Message :" + message);
		System.out.println("Length: " + length);
		
		if(length>limit) {
			System.out.println("Limit Exceeded! Max allowed : " + limit);
		}else {
			System.out.println("Within Limit");
		}
	}
}
