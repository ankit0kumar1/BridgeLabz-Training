package com.stream.listtomap;

import java.util.*;
import java.util.stream.Collectors;

public class KeepLastDuplicate {
	public static void main(String[] args) {
		List<Employee> list = List.of(
				new Employee(101, "Ankit"),
				new Employee(102, "aryan"),
				new Employee(103, "keshav"),
				new Employee(101, "rohan")
				);
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(e -> e.id, e -> e.name ,
						(existing, latest)-> latest
						));
		System.out.println(map);
	}
}
