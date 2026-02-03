package com.streamapi.transformingnames;

import java.util.*;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args) {
		List<String> customers = Arrays.asList(
                "ankit", "rohan", "Neha", "amit", "Priya"
        );
		List<String> result = customers.stream()
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(result);
				
	}
}
