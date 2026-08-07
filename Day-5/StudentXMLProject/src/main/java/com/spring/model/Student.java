package com.spring.model;

public class Student {

    private int id;
    private String name;
    private String course;
    private Address address;

    public Student() {
    }

    // Constructor Injection
    public Student(int id, String name, String course, Address address) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {

        System.out.println("ID      : " + id);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);

        address.display();
    }
}