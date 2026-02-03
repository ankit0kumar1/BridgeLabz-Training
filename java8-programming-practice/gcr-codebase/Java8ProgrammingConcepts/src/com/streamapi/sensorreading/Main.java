package com.streamapi.sensorreading;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		List<Double> readings = Arrays.asList(
                23.5, 45.2, 60.1, 15.7, 72.9, 55.0, 90.4
        );
		double threshold = 50;
		System.out.println("Readings Above Threshold");
		readings.stream()
		.filter(r -> r >threshold)
		.forEach(System.out::println);
	}
}
