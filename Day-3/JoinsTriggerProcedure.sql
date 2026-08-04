create database HealthClinicDB;
use HealthClinicDB;

CREATE TABLE Department (
    DepartmentID INT AUTO_INCREMENT PRIMARY KEY,
    DepartmentName VARCHAR(80) NOT NULL
);

CREATE TABLE Doctor (
    DoctorID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Specialization VARCHAR(100) NOT NULL,
    Phone VARCHAR(15) UNIQUE,
    DepartmentID INT NOT NULL,

    FOREIGN KEY (DepartmentID)
    REFERENCES Department(DepartmentID)
);

CREATE TABLE Patient (
    PatientID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    DateOfBirth DATE NOT NULL,
    Gender CHAR(1),
    Phone VARCHAR(15) UNIQUE,
    Address VARCHAR(200),

    CHECK (Gender IN ('M','F','O'))
);

CREATE TABLE Appointment (
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
);

SHOW TABLES;

DESC Department;

DESC Doctor;

DESC Patient;

DESC Appointment;

INSERT INTO Department (DepartmentName)
VALUES
('Cardiology'),
('Orthopedic'),
('Neurology'),
('Dermatology');

SELECT * FROM Department;

INSERT INTO Doctor
(FirstName, LastName, Specialization, Phone, DepartmentID)

VALUES

('Anita','Sharma','Cardiologist','9876500001',1),

('Suresh','Patel','Orthopedic','9876500002',2),

('Rahul','Verma','Neurologist','9876500003',3),

('Neha','Singh','Dermatologist','9876500004',4);


SELECT * FROM Doctor;

INSERT INTO Patient
(FirstName, LastName, DateOfBirth, Gender, Phone, Address)

VALUES

('Rajeev','Kumar','1998-05-10','M','9396847248','Bhopal'),

('Mohit','Sharma','1995-09-12','F','9956473853','Indore'),

('Anuj','Verma','2000-01-20','M','9344354673','Jabalpur'),

('Palak','Singh','1997-08-15','F','9164735464','Sagar');

SELECT * FROM Patient;

INSERT INTO Appointment
(PatientID, DoctorID, AppointmentDate, TimeSlot, Status)

VALUES

(1,1,'2026-08-10','10:00:00','Scheduled'),

(2,2,'2026-08-11','11:00:00','Completed'),

(3,3,'2026-08-12','09:30:00','Scheduled'),

(4,4,'2026-08-13','02:00:00','Cancelled'),

(1,2,'2026-08-14','03:00:00','Scheduled');

SELECT * FROM Appointment;


SELECT *
FROM Patient
WHERE PatientID=1;

SELECT *
FROM Patient
WHERE Gender='F';

UPDATE Patient SET Gender = 'M' where PatientID = 2;
SELECT * FROM Patient;

SELECT *
FROM Doctor
WHERE DepartmentID=1;

UPDATE Patient
SET Address='Indore'
WHERE PatientID=2;
SELECT * FROM Patient;

SELECT *
FROM Patient
ORDER BY FirstName;

SELECT *
FROM Patient
LIMIT 2;

SELECT COUNT(*)
FROM Patient;

SELECT *
FROM Appointment
WHERE Status='Scheduled';

SELECT
DoctorID,
COUNT(*) AS TotalAppointments
FROM Appointment
GROUP BY DoctorID;

SELECT COUNT(*) AS TotalDoctors
FROM Doctor;

-- Joins

SELECT
    P.FirstName,
    P.LastName,
    A.AppointmentDate,
    A.TimeSlot
FROM Patient P
INNER JOIN Appointment A
ON P.PatientID = A.PatientID;

SELECT
    D.FirstName,
    D.LastName,
    A.AppointmentDate,
    A.Status
FROM Doctor D
INNER JOIN Appointment A
ON D.DoctorID = A.DoctorID;

SELECT
    D.FirstName,
    D.LastName,
    Dep.DepartmentName
FROM Doctor D
INNER JOIN Department Dep
ON D.DepartmentID = Dep.DepartmentID;

use HealthClinicDB;

SELECT
    P.PatientID,
    P.FirstName,
    P.LastName,
    A.AppointmentDate,
    A.Status
FROM Patient P
LEFT JOIN Appointment A
ON P.PatientID = A.PatientID;

SELECT
    P.FirstName AS Patient,
    D.FirstName AS Doctor
FROM Patient P
CROSS JOIN Doctor D;

-- Procedure

USE HealthClinicDB;

DELIMITER $$

CREATE PROCEDURE ShowPatients()
BEGIN
    SELECT * FROM Patient;
END $$

DELIMITER ;

SHOW PROCEDURE STATUS
WHERE Db='healthclinicdb';

CALL ShowPatients();

-- Trigger

CREATE TABLE Appointment_Log (
    LogID INT AUTO_INCREMENT PRIMARY KEY,
    Message VARCHAR(255),
    LogDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

SELECT * FROM Appointment_Log;

DELIMITER $$

CREATE TRIGGER afterInsertTrigger
AFTER INSERT
ON Appointment
FOR EACH ROW
BEGIN
    INSERT INTO Appointment_Log(Message)
    VALUES (
        CONCAT('New Appointment Added. Appointment ID: ', NEW.AppointmentID)
    );
END $$

DELIMITER ;

SHOW TRIGGERS FROM HealthClinicDB;

INSERT INTO Appointment
(PatientID, DoctorID, AppointmentDate, TimeSlot, Status)
VALUES
(2,3,'2026-08-20','10:30:00','Scheduled');

select * from Appointment_Log;

