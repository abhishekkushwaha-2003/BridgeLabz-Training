package com.healthclinic.model;

public class Doctor {

    private int doctorId;
    private String firstName;
    private String lastName;
    private String specialization;
    private String phone;
    private int departmentId;

    public Doctor() {
    }

    public Doctor(int doctorId, String firstName, String lastName,
                  String specialization, String phone, int departmentId) {
        this.doctorId = doctorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.phone = phone;
        this.departmentId = departmentId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Doctor Details : \n" +
        		"    doctorId       = " + doctorId + "\n" +
        		"    firstName      = " + firstName + "\n" +
        		"    lastName       = " + lastName + "\n" +
        		"    specialization = " + specialization + "\n" +
        		"    phone          = " + phone + "\n" +
        		"    departmentId   = " + departmentId + "\n";
    }
}