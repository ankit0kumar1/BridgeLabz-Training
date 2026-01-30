package com.csvdatahandling;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opencsv.CSVWriter;

public class DatabaseToCSV  {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "root";
        String password = "your_password";

        String outputFile = "src/main/resources/employee_report.csv";

        String query = "SELECT emp_id, name, department, salary FROM employees";

        try (
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                CSVWriter writer = new CSVWriter(new FileWriter(outputFile));
        ) {

            // Write Header
            String[] header = {"Employee ID", "Name", "Department", "Salary"};
            writer.writeNext(header);

            int count = 0;

            // Write Records
            while (rs.next()) {
                String empId = rs.getString("emp_id");
                String name = rs.getString("name");
                String department = rs.getString("department");
                String salary = rs.getString("salary");

                String[] row = {empId, name, department, salary};
                writer.writeNext(row);
                count++;
            }

            System.out.println("CSV Report Generated Successfully!");
            System.out.println("File: " + outputFile);
            System.out.println("Total records exported: " + count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

