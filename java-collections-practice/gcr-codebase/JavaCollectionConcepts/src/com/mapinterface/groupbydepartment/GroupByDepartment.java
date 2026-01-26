package com.mapinterface.groupbydepartment;

import java.util.*;
public class GroupByDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = groupByDepartment(employees);

        System.out.println(grouped);
        // Output: {HR=[Alice, Carol], IT=[Bob]}
    }

    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee emp : employees) {
            map.computeIfAbsent(emp.getDepartment(), d -> new ArrayList<>()).add(emp);
        }

        return map;
    }
}
