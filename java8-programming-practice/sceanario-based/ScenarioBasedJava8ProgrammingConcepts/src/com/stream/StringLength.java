package com.stream;

import java.util.Arrays;
import java.util.List;

public class StringLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("cat","elephant","dog");
		List<Integer> length = list.stream()
				.map(s ->s.length())
				.toList();
		System.out.println(length);
 	}
}
