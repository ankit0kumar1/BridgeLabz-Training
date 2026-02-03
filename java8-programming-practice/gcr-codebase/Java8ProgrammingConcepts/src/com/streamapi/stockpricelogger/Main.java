package com.streamapi.stockpricelogger;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Double> stockPrice = Arrays.asList(2434.00,7845.45,5464.45,4515.12);
		stockPrice.stream()
		.forEach(System.out::println);
		
	}
}
