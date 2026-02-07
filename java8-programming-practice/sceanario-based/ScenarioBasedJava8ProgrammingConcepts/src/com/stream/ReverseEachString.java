package com.stream;

import java.util.Arrays;
import java.util.List;

public class ReverseEachString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","api");
		List<String> revEach = list.stream()
				.map(s -> new StringBuilder(s).reverse().toString())
				.toList();
		System.out.println(revEach);
	}
}
