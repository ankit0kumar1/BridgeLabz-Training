package com.functionalinterface.dataexportfeature;

class EmployeeReportExporter implements ReportExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Employee Report exported to CSV.");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Employee Report exported to PDF.");
    }
}