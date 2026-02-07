package com.stream;

import java.util.Arrays;
import java.util.List;

public class RemoveEmptyStrings {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","","spring","","boot");
		List<String> nonEmptyList = list.stream()
				.filter(s -> s.length()!=0)
				.toList();
		System.out.println(nonEmptyList);
	}
}
