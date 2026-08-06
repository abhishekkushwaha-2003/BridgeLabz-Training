package com.healthclinic.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitializer {

    public static void createTables() {

        try (Connection connection = DBConnection.getConnection();
             Statement stmt = connection.createStatement()) {

            // Department Table
        	
            String departmentTable = """
                    CREATE TABLE IF NOT EXISTS Department (
                        DepartmentID INT AUTO_INCREMENT PRIMARY KEY,
                        DepartmentName VARCHAR(80) NOT NULL
                    )
                    """;

            stmt.execute(departmentTable);

            // Doctor Table
            
            String doctorTable = """
                    CREATE TABLE IF NOT EXISTS Doctor (
                        DoctorID INT AUTO_INCREMENT PRIMARY KEY,
                        FirstName VARCHAR(50) NOT NULL,
                        LastName VARCHAR(50) NOT NULL,
                        Specialization VARCHAR(100) NOT NULL,
                        Phone VARCHAR(15) UNIQUE,
                        DepartmentID INT NOT NULL,

                        FOREIGN KEY (DepartmentID)
                        REFERENCES Department(DepartmentID)
                    )
                    """;

            stmt.execute(doctorTable);

            // Patient Table

            String patientTable = """
                    CREATE TABLE IF NOT EXISTS Patient (
                        PatientID INT AUTO_INCREMENT PRIMARY KEY,
                        FirstName VARCHAR(50) NOT NULL,
                        LastName VARCHAR(50) NOT NULL,
                        DateOfBirth DATE NOT NULL,
                        Gender CHAR(1),
                        Phone VARCHAR(15) UNIQUE,
                        Address VARCHAR(200),

                        CHECK (Gender IN ('M','F','O'))
                    )
                    """;

            stmt.execute(patientTable);

            // Appointment Table

            String appointmentTable = """
                    CREATE TABLE IF NOT EXISTS Appointment (
                        AppointmentID INT AUTO_INCREMENT PRIMARY KEY,
                        PatientID INT NOT NULL,
                        DoctorID INT NOT NULL,
                        AppointmentDate DATE NOT NULL,
                        TimeSlot TIME NOT NULL,
                        Status VARCHAR(20) DEFAULT 'Scheduled',

                        FOREIGN KEY (PatientID)
                        REFERENCES Patient(PatientID),

                        FOREIGN KEY (DoctorID)
                        REFERENCES Doctor(DoctorID)
                    )
                    """;

            stmt.execute(appointmentTable);
            
         // Visit Table

            String visitTable = """
                CREATE TABLE IF NOT EXISTS Visit (

                    VisitID INT AUTO_INCREMENT PRIMARY KEY,

                    AppointmentID INT NOT NULL,

                    VisitDate DATE NOT NULL,

                    Diagnosis VARCHAR(255),

                    Prescription VARCHAR(255),

                    FOREIGN KEY (AppointmentID)
                    REFERENCES Appointment(AppointmentID)

                )
                """;

            stmt.execute(visitTable);
            
            
         // Billing Table

            String billingTable = """
                CREATE TABLE IF NOT EXISTS Billing (

                    BillID INT AUTO_INCREMENT PRIMARY KEY,

                    VisitID INT NOT NULL,

                    Amount DECIMAL(10,2) NOT NULL,

                    PaymentStatus VARCHAR(30) NOT NULL,

                    FOREIGN KEY (VisitID)
                    REFERENCES Visit(VisitID)

                )
                """;

            stmt.execute(billingTable);

            System.out.println("All tables created successfully.");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }

}