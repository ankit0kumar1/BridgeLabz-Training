package com.stream.listtomap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
	int id;
	String name;
	public Employee(int id , String name) {
		this.id = id;
		this.name = name;
		
	}
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>(List.of(
				new Employee(1, "Ankit"),
				new Employee(4, "Nitin"),
				new Employee(2, "Keshav"),
				new Employee(3,"Aryan")
				));
		Map<Integer, String> map = list.stream()
				.collect(Collectors.toMap(e -> e.id, e-> e.name));
		System.out.println(map);
	}
}
