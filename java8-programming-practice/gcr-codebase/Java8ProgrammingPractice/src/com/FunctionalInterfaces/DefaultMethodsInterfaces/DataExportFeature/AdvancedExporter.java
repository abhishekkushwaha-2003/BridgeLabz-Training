package com.FunctionalInterfaces.DefaultMethodsInterfaces.DataExportFeature;

public class AdvancedExporter implements ReportExporter {

    @Override
    public void export() {
        System.out.println("Exporting report in custom format");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Exporting report in optimized JSON");
    }
}
