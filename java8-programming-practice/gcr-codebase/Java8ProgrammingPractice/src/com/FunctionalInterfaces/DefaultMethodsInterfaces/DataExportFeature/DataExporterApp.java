package com.FunctionalInterfaces.DefaultMethodsInterfaces.DataExportFeature;

public class DataExporterApp {
    public static void main(String[] args) {

        ReportExporter r1 = new CsvExporter();
        ReportExporter r2 = new AdvancedExporter();

        r1.exportToJSON();
        r2.exportToJSON();
    }
}
