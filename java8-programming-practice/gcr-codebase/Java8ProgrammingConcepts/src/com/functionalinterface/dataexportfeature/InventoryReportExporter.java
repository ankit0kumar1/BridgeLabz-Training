package com.functionalinterface.dataexportfeature;

class InventoryReportExporter implements ReportExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Inventory Report exported to CSV.");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Inventory Report exported to PDF.");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Inventory Report exported to JSON.");
    }
}