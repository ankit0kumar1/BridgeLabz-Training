package com.jsonpractice;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DBJsonReport {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String pass = "root";

        String sql = "SELECT id, name, email, salary FROM employees";

        List<Employee> employees = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDouble("salary")
                );
                employees.add(emp);
            }
        }

        // Convert list to JSON
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("employees_report.json"), employees);

        System.out.println("✅ JSON report generated: employees_report.json");
    }
}

