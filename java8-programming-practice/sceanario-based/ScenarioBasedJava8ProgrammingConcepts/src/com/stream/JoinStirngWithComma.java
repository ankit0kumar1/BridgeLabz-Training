package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStirngWithComma {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","Spring","Boot");
		String joined = list.stream()
				.collect(Collectors.joining(","));
		System.out.println(joined);
	}
}
