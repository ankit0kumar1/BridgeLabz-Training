package com.stream.listtomap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class HandleDuplicateKey {
	public static void main(String[] args) {
		List<Employee> list = List.of(
				new Employee(101, "Ankit"),
				new Employee(102, "aryan"),
				new Employee(103, "keshav"),
				new Employee(101, "rohan")
				);
		
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(e -> e.id, e -> e.name,
						(existing, duplicate)-> existing + ", " + duplicate
						));
		System.out.println(map);
	}
}
