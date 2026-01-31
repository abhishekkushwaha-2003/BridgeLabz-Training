package com.FunctionalInterfaces.DefaultMethodsInterfaces.DataExportFeature;

public interface ReportExporter {

    void export();   

    default void exportToJSON() {
        System.out.println("Exporting report in JSON format (default)");
    }
}
