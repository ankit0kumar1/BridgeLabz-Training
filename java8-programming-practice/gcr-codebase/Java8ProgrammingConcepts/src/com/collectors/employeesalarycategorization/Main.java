package com.collectors.employeesalarycategorization;

import java.util.*;
import java.util.stream.*;
public class Main {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
                new Employee("Ankit", "IT", 50000),
                new Employee("Ravi", "HR", 40000),
                new Employee("Neha", "IT", 60000),
                new Employee("Sita", "HR", 45000),
                new Employee("Rahul", "Sales", 55000)
        );
		
		Map<String, Double> avgSalaryByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDept,
						Collectors.averagingDouble(Employee::getSalary)
						));
		System.out.println(avgSalaryByDept);
	}
}
