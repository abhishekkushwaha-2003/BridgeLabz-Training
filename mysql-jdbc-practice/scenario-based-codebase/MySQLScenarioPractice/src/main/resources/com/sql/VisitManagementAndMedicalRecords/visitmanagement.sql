mysql> CREATE DATABASE hospitalVisitManagement;
Query OK, 1 row affected (0.10 sec)

mysql> USE hospitalVisitManagement;
Database changed
mysql> CREATE TABLE patients (
    ->     patient_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     name VARCHAR(100) NOT NULL,
    ->     dob DATE,
    ->     phone VARCHAR(15) UNIQUE,
    ->     email VARCHAR(100) UNIQUE,
    ->     address TEXT,
    ->     blood_group VARCHAR(5),
    ->     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    -> );
Query OK, 0 rows affected (0.20 sec)

mysql> show tables;
+-----------------------------------+
| Tables_in_hospitalvisitmanagement |
+-----------------------------------+
| patients                          |
+-----------------------------------+
1 row in set (0.05 sec)

mysql> CREATE TABLE doctors (
    ->     doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     doctor_name VARCHAR(100)
    -> );
Query OK, 0 rows affected (0.05 sec)

mysql> CREATE TABLE appointments (
    ->     appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     patient_id INT,
    ->     doctor_id INT,
    ->     appointment_date DATE,
    ->     status VARCHAR(20) DEFAULT 'SCHEDULED',
    ->     FOREIGN KEY(patient_id) REFERENCES patients(patient_id),
    ->     FOREIGN KEY(doctor_id) REFERENCES doctors(doctor_id)
    -> );
Query OK, 0 rows affected (0.10 sec)

mysql> CREATE TABLE visits (
    ->     visit_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     appointment_id INT,
    ->     diagnosis TEXT,
    ->     notes TEXT,
    ->     FOREIGN KEY(appointment_id) REFERENCES appointments(appointment_id)
    -> );
Query OK, 0 rows affected (0.08 sec)

mysql> CREATE TABLE prescriptions (
    ->     prescription_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     visit_id INT,
    ->     medicine_name VARCHAR(100),
    ->     dosage VARCHAR(50),
    ->     duration VARCHAR(50),
    ->     FOREIGN KEY(visit_id) REFERENCES visits(visit_id)
    -> );
Query OK, 0 rows affected (0.09 sec)

mysql> show tables;
+-----------------------------------+
| Tables_in_hospitalvisitmanagement |
+-----------------------------------+
| appointments                      |
| doctors                           |
| patients                          |
| prescriptions                     |
| visits                            |
+-----------------------------------+
5 rows in set (0.00 sec)

mysql> INSERT INTO patients
    -> (name, dob, phone, email, address, blood_group)
    -> VALUES
    -> ('Abhishek Kushwaha','2003-03-15','9876543211','abhi@gmail.com','Bhopal','A+');
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO doctors
    -> (doctor_name)
    -> VALUES
    -> ('Dr. Mehta');
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO appointments
    -> (patient_id, doctor_id, appointment_date)
    -> VALUES
    -> (1,1,'2026-02-15');
Query OK, 1 row affected (0.02 sec)

mysql> show tables;
+-----------------------------------+
| Tables_in_hospitalvisitmanagement |
+-----------------------------------+
| appointments                      |
| doctors                           |
| patients                          |
| prescriptions                     |
| visits                            |
+-----------------------------------+
5 rows in set (0.01 sec)

mysql> START TRANSACTION;
Query OK, 0 rows affected (0.01 sec)

mysql> INSERT INTO visits
    -> (appointment_id, diagnosis, notes)
    -> VALUES
    -> (1,'Viral Fever','Patient has mild fever and cold');
Query OK, 1 row affected (0.01 sec)

mysql> UPDATE appointments
    -> SET status = 'COMPLETED'
    -> WHERE appointment_id = 1;
Query OK, 1 row affected (0.01 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> COMMIT;
Query OK, 0 rows affected (0.02 sec)

mysql> INSERT INTO prescriptions
    -> (visit_id, medicine_name, dosage, duration)
    -> VALUES
    -> (1,'Paracetamol','500mg','5 days'),
    -> (1,'Cetrizine','10mg','3 days'),
    -> (1,'Vitamin C','1 tablet daily','7 days');
Query OK, 3 rows affected (0.02 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT
    -> a.appointment_date,
    -> d.doctor_name,
    -> v.diagnosis,
    -> v.notes,
    -> p.medicine_name,
    -> p.dosage,
    -> p.duration
    -> FROM visits v
    -> JOIN appointments a
    -> ON v.appointment_id = a.appointment_id
    -> JOIN doctors d
    -> ON a.doctor_id = d.doctor_id
    -> JOIN prescriptions p
    -> ON v.visit_id = p.visit_id
    -> WHERE a.patient_id = 1
    -> ORDER BY a.appointment_date DESC;
+------------------+-------------+-------------+---------------------------------+---------------+----------------+----------+
| appointment_date | doctor_name | diagnosis   | notes                           | medicine_name | dosage         | duration |
+------------------+-------------+-------------+---------------------------------+---------------+----------------+----------+
| 2026-02-15       | Dr. Mehta   | Viral Fever | Patient has mild fever and cold | Paracetamol   | 500mg          | 5 days   |
| 2026-02-15       | Dr. Mehta   | Viral Fever | Patient has mild fever and cold | Cetrizine     | 10mg           | 3 days   |
| 2026-02-15       | Dr. Mehta   | Viral Fever | Patient has mild fever and cold | Vitamin C     | 1 tablet daily | 7 days   |
+------------------+-------------+-------------+---------------------------------+---------------+----------------+----------+
3 rows in set (0.01 sec)

mysql>