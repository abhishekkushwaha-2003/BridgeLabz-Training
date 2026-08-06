package com.healthclinic.model;

import java.time.LocalDate;

public class Patient {

    private int patientId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String phone;
    private String address;

    public Patient() {
    }

    public Patient(int patientId, String firstName, String lastName,
                   LocalDate dateOfBirth, String gender,
                   String phone, String address) {
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Patient Details : \n" +
               "    patientId   = " + patientId + "\n" +
               "    firstName   = " + firstName + "\n" +
               "    lastName    = " + lastName + "\n" +
               "    dateOfBirth = " + dateOfBirth + "\n" +
               "    gender      = " + gender + "\n" +
               "    phone       = " + phone + "\n" +
               "    address     = " + address + "\n";
    }
    
}