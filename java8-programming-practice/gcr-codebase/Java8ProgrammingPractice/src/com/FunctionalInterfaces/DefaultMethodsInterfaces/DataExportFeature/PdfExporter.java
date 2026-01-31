package com.FunctionalInterfaces.DefaultMethodsInterfaces.DataExportFeature;

public class PdfExporter implements ReportExporter {

    @Override
    public void export() {
        System.out.println("Exporting report as PDF");
    }
}
