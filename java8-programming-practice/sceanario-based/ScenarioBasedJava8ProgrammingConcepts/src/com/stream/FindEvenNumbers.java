package com.stream;

import java.util.*; 

public class FindEvenNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,7,8,10,13);
		
		List<Integer> evenList = list.stream()
				.filter(x -> x%2==0)
				.toList();
		System.out.println(evenList);
	}
}
