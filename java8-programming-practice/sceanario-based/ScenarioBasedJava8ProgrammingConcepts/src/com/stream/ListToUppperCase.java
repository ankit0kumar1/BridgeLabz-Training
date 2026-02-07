package com.stream;

import java.util.Arrays;
import java.util.List;

public class ListToUppperCase {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","spring","boot");
		List<String> transformed = list.stream()
				.map(String::toUpperCase)
				.toList();
		System.out.println(transformed);
	}
}	
