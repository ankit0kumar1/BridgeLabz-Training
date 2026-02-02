package com.functionalinterface.dataexportfeature;

public class Main {
    public static void main(String[] args) {

        ReportExporter sales = new SalesReportExporter();
        ReportExporter employee = new EmployeeReportExporter();
        ReportExporter inventory = new InventoryReportExporter();

        sales.exportToCSV();
        sales.exportToPDF();
        sales.exportToJSON();      // default runs

        employee.exportToCSV();
        employee.exportToPDF();
        employee.exportToJSON();   // default runs

        inventory.exportToCSV();
        inventory.exportToPDF();
        inventory.exportToJSON();  // overridden runs
    }
}
