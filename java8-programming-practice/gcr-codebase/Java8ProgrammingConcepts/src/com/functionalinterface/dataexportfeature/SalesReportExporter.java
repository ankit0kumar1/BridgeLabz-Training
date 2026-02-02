package com.functionalinterface.dataexportfeature;

class SalesReportExporter implements ReportExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Sales Report exported to CSV.");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Sales Report exported to PDF.");
    }
}
