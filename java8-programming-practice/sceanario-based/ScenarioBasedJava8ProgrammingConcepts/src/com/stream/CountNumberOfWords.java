package com.stream;

public class CountNumberOfWords {
	public static void main(String[] args) {
		String s = "java is very powerful";
		long count = java.util.Arrays.stream(s.split("\\s+"))
				.count();
		System.out.println(count);
	}
}
