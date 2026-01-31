package com.FunctionalInterfaces.DefaultMethodsInterfaces.DataExportFeature;
public class CsvExporter implements ReportExporter {

    @Override
    public void export() {
        System.out.println("Exporting report as CSV");
    }
}
