package com.functionalinterface.dataexportfeature;

interface ReportExporter {

    void exportToCSV();
    void exportToPDF();

    // Added later without breaking old implementations
    default void exportToJSON() {
        System.out.println("JSON export not supported yet for this exporter.");
    }
}
