mysql> Create database mysqlScenarioPractice;
Query OK, 1 row affected (0.10 sec)

mysql> use mysqlScenarioPractice
Database changed

mysql> CREATE TABLE appointment (
    ->     appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     patient_id INT NOT NULL,
    ->     doctor_id INT NOT NULL,
    ->     appointment_date DATE NOT NULL,
    ->     appointment_time TIME NOT NULL,
    ->     status VARCHAR(20) DEFAULT 'SCHEDULED',
    ->     reason VARCHAR(200),
    ->
    ->     FOREIGN KEY (patient_id) REFERENCES patients(patient_id),
    ->     FOREIGN KEY (doctor_id) REFERENCES doctor(doctor_id)
    -> );
    
Query OK, 0 rows affected (0.12 sec)

mysql> CREATE TABLE appointment_audit (
    ->     audit_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     appointment_id INT,
    ->     action VARCHAR(20),
    ->     action_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ->     note TEXT,
    ->
    ->     FOREIGN KEY (appointment_id)
    ->         REFERENCES appointment(appointment_id)
    -> );
    
Query OK, 0 rows affected (0.10 sec)

mysql> SELECT COUNT(*) AS slot_count
    -> FROM appointment
    -> WHERE doctor_id = 5
    -> AND appointment_date = '2026-02-10'
    -> AND appointment_time = '10:00:00'
    -> AND status = 'SCHEDULED';
+------------+
| slot_count |
+------------+
|          0 |
+------------+
1 row in set (0.02 sec)

mysql> SELECT patient_id, name
    -> FROM patients;
+------------+--------------+
| patient_id | name         |
+------------+--------------+
|          1 | Rohit Sharma |
+------------+--------------+
1 row in set (0.01 sec)

mysql> INSERT INTO patients
    -> (name, dob, phone, email, address, blood_group)
    -> VALUES
    -> ('Rohit Gupta','2002-04-15','9000000000',
    ->  'rohit@mail.com','Bhopal','O+');
    
Query OK, 1 row affected (0.00 sec)

mysql> SELECT LAST_INSERT_ID();
+------------------+
| LAST_INSERT_ID() |
+------------------+
|                2 |
+------------------+
1 row in set (0.01 sec)

mysql> SELECT doctor_id, doctor_name
    -> FROM doctor;
+-----------+----------------+
| doctor_id | doctor_name    |
+-----------+----------------+
|         2 | Dr. Amit Verma |
+-----------+----------------+
1 row in set (0.01 sec)
