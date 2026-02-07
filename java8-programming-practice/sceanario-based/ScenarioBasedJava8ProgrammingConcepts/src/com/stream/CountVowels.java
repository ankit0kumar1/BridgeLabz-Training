package com.stream;

public class CountVowels {
	public static void main(String[] args) {
		String s = "programming";
		long count = s.chars()
				.filter(c -> "aeiou".indexOf(c) != -1)
				.count();
			System.out.println(count);
	}
}
