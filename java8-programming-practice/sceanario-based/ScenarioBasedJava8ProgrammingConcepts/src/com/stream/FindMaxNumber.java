package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class FindMaxNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,25,3,99,45);
		OptionalInt max =list.stream()
				.mapToInt(x -> x)
				.max();
		System.out.println(max.getAsInt());
	}
}
