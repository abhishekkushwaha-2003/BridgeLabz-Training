mysql> Create database mysqlScenarioPractice;
Query OK, 1 row affected (0.10 sec)

mysql> use mysqlScenarioPractice
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
    
Query OK, 0 rows affected (0.17 sec)

mysql> SELECT patient_id
    -> FROM patients
    -> WHERE phone = '9876543210'
    ->    OR email = 'abc@mail.com';
Empty set (0.04 sec)

mysql> INSERT INTO patients
    -> (name, dob, phone, email, address, blood_group)
    -> VALUES
    -> ('Rohit Sharma','2001-05-10','9876543210',
    ->  'abc@mail.com','Bhopal','O+');
    
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM patients
    -> WHERE patient_id = 101
    ->    OR phone = '9876543210';
+------------+--------------+------------+------------+--------------+---------+-------------+---------------------+
| patient_id | name         | dob        | phone      | email        | address | blood_group | created_at          |
+------------+--------------+------------+------------+--------------+---------+-------------+---------------------+
|          1 | Rohit Sharma | 2001-05-10 | 9876543210 | abc@mail.com | Bhopal  | O+          | 2026-02-09 14:30:32 |
+------------+--------------+------------+------------+--------------+---------+-------------+---------------------+
1 row in set (0.00 sec)


mysql> UPDATE patients
    -> SET address = 'Indore',
    ->     blood_group = 'A+',
    ->     phone = '9999999999'
    -> WHERE patient_id = 101;
    
Query OK, 0 rows affected (0.00 sec)
Rows matched: 0  Changed: 0  Warnings: 0

mysql> SELECT *
    -> FROM patients
    -> WHERE name LIKE '%rohit%';
+------------+--------------+------------+------------+--------------+---------+-------------+---------------------+
| patient_id | name         | dob        | phone      | email        | address | blood_group | created_at          |
+------------+--------------+------------+------------+--------------+---------+-------------+---------------------+
|          1 | Rohit Sharma | 2001-05-10 | 9876543210 | abc@mail.com | Bhopal  | O+          | 2026-02-09 14:30:32 |
+------------+--------------+------------+------------+--------------+---------+-------------+---------------------+
1 row in set (0.01 sec)

mysql> SELECT *
    -> FROM patients
    -> WHERE patient_id = 101;
Empty set (0.00 sec)

mysql> SELECT *
    -> FROM patients
    -> WHERE phone = '9876543210';
+------------+--------------+------------+------------+--------------+---------+-------------+---------------------+
| patient_id | name         | dob        | phone      | email        | address | blood_group | created_at          |
+------------+--------------+------------+------------+--------------+---------+-------------+---------------------+
|          1 | Rohit Sharma | 2001-05-10 | 9876543210 | abc@mail.com | Bhopal  | O+          | 2026-02-09 14:30:32 |
+------------+--------------+------------+------------+--------------+---------+-------------+---------------------+
1 row in set (0.00 sec)

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
    ->     FOREIGN KEY(patient_id) REFERENCES patients(patient_id),
    ->     FOREIGN KEY(doctor_id) REFERENCES doctors(doctor_id)
    -> );
    
Query OK, 0 rows affected (0.11 sec)

mysql> CREATE TABLE visits (
    ->     visit_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     appointment_id INT,
    ->     diagnosis TEXT,
    ->     prescription TEXT,
    ->     FOREIGN KEY(appointment_id) REFERENCES appointments(appointment_id)
    -> );
    
Query OK, 0 rows affected (0.10 sec)


mysql> SELECT
    ->     a.appointment_date,
    ->     d.doctor_name,
    ->     v.diagnosis,
    ->     v.prescription
    -> FROM appointments a
    -> JOIN visits v
    ->     ON a.appointment_id = v.appointment_id
    -> JOIN doctors d
    ->     ON a.doctor_id = d.doctor_id
    -> WHERE a.patient_id = 101
    -> ORDER BY a.appointment_date DESC;
    
Empty set (0.02 sec)
