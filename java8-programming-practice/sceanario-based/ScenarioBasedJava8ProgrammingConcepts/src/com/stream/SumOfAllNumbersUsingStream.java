package com.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbersUsingStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int sum = list.stream()
				.mapToInt(x -> x)
				.sum();
		System.out.println(sum);
				
	}
}
