package com.collectors.studentresultgrouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Ankit", "A"),
                new Student("Ravi", "B"),
                new Student("Sanchit", "A"),
                new Student("Rahul", "C"),
                new Student("Nitin", "B")
				);
		
		Map<String, List<String>> grouped = students.stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.mapping(Student::getName, Collectors.toList())
						));
		System.out.println(grouped);
	}
}
