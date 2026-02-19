package com.stream.listtomap;

import java.util.*;

import java.util.stream.Collectors;

public class WordFrequency {
	public static void main(String[] args) {
		List<String>list = List.of("java", "is", "programming" , "language", "java", "is","cool");
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(e-> e, Collectors.counting()));
		System.out.println(map);
	}
}
