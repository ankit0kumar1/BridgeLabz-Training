package com.stream;

import java.util.Arrays;
import java.util.List;

public class CountStringStartWithA {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","ant","car");
		long count = list.stream()
				.filter(s-> s.startsWith("a"))
				.count();
		System.out.println(count);
				
	}
}
