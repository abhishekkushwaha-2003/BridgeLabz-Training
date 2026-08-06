package com.healthclinic.model;

import java.time.LocalDate;

public class Visit {

    private int visitId;
    private int appointmentId;
    private LocalDate visitDate;
    private String diagnosis;
    private String prescription;

    public Visit() {
    }

    public Visit(int visitId, int appointmentId, LocalDate visitDate,
            String diagnosis, String prescription) {

        this.visitId = visitId;
        this.appointmentId = appointmentId;
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        return "Visit Details : \n" +
        		"    visitId       = " + visitId + "\n" +
        		"    appointmentId = " + appointmentId + "\n" +
        		"    visitDate     = " + visitDate + "\n" +
        		"    diagnosis     = " + diagnosis + "\n" +
        		"    prescription  = " + prescription + "\n";
    }

}