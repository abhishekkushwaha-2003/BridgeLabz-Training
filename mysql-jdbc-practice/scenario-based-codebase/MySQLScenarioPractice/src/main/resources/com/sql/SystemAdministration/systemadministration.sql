mysql> CREATE DATABASE hospitalAdminManagement;
Query OK, 1 row affected (0.02 sec)

mysql> USE hospitalAdminManagement;
Database changed
mysql> CREATE TABLE specialties (
    ->     specialty_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     specialty_name VARCHAR(100) UNIQUE NOT NULL
    -> );
Query OK, 0 rows affected (0.08 sec)

mysql> CREATE TABLE doctors (
    ->     doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     doctor_name VARCHAR(100),
    ->     specialty_id INT,
    ->     FOREIGN KEY (specialty_id) REFERENCES specialties(specialty_id)
    -> );
Query OK, 0 rows affected (0.09 sec)

mysql> CREATE TABLE audit_log (
    ->     log_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     user_name VARCHAR(100),
    ->     action_type VARCHAR(20),
    ->     table_name VARCHAR(100),
    ->     record_id INT,
    ->     action_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    -> );
Query OK, 0 rows affected (0.05 sec)

mysql> INSERT INTO specialties (specialty_name)
    -> VALUES ('Cardiology'), ('Neurology'), ('Orthopedics');
Query OK, 3 rows affected (0.02 sec)
Records: 3  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM specialties;
+--------------+----------------+
| specialty_id | specialty_name |
+--------------+----------------+
|            1 | Cardiology     |
|            2 | Neurology      |
|            3 | Orthopedics    |
+--------------+----------------+
3 rows in set (0.00 sec)

mysql> UPDATE specialties
    -> SET specialty_name = 'Neuro Surgery'
    -> WHERE specialty_id = 2;
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT COUNT(*) AS doctor_count
    -> FROM doctors
    -> WHERE specialty_id = 1;
+--------------+
| doctor_count |
+--------------+
|            0 |
+--------------+
1 row in set (0.01 sec)

mysql> DELETE FROM specialties
    -> WHERE specialty_id = 3
    -> AND (SELECT COUNT(*) FROM doctors WHERE specialty_id = 3) = 0;
Query OK, 1 row affected (0.02 sec)

mysql> DELIMITER $$
mysql> CREATE TRIGGER after_specialty_insert
    -> AFTER INSERT ON specialties
    -> FOR EACH ROW
    -> BEGIN
    ->     INSERT INTO audit_log (user_name, action_type, table_name, record_id)
    ->     VALUES (CURRENT_USER(), 'INSERT', 'specialties', NEW.specialty_id);
    -> END$$
Query OK, 0 rows affected (0.03 sec)

mysql> CREATE TRIGGER after_specialty_update
    -> AFTER UPDATE ON specialties
    -> FOR EACH ROW
    -> BEGIN
    ->     INSERT INTO audit_log (user_name, action_type, table_name, record_id)
    ->     VALUES (CURRENT_USER(), 'UPDATE', 'specialties', NEW.specialty_id);
    -> END$$
Query OK, 0 rows affected (0.03 sec)

mysql>
mysql> CREATE TRIGGER after_specialty_delete
    -> AFTER DELETE ON specialties
    -> FOR EACH ROW
    -> BEGIN
    ->     INSERT INTO audit_log (user_name, action_type, table_name, record_id)
    ->     VALUES (CURRENT_USER(), 'DELETE', 'specialties', OLD.specialty_id);
    -> END$$
Query OK, 0 rows affected (0.03 sec)

mysql> DELIMITER ;
mysql> INSERT INTO specialties (specialty_name)
    -> VALUES ('Dermatology');
Query OK, 1 row affected (0.02 sec)

mysql> UPDATE specialties
    -> SET specialty_name = 'Pediatrics'
    -> WHERE specialty_id = 1;
Query OK, 1 row affected (0.02 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> show tables;
+-----------------------------------+
| Tables_in_hospitaladminmanagement |
+-----------------------------------+
| audit_log                         |
| doctors                           |
| specialties                       |
+-----------------------------------+
3 rows in set (0.00 sec)

mysql> SELECT * FROM specialties;
+--------------+----------------+
| specialty_id | specialty_name |
+--------------+----------------+
|            4 | Dermatology    |
|            2 | Neuro Surgery  |
|            1 | Pediatrics     |
+--------------+----------------+
3 rows in set (0.00 sec)

mysql> DELETE FROM specialties
    -> WHERE specialty_id = 3
    -> AND (SELECT COUNT(*) FROM doctors WHERE specialty_id = 3) = 0;
Query OK, 0 rows affected (0.00 sec)

mysql> SELECT * FROM specialties;
+--------------+----------------+
| specialty_id | specialty_name |
+--------------+----------------+
|            4 | Dermatology    |
|            2 | Neuro Surgery  |
|            1 | Pediatrics     |
+--------------+----------------+
3 rows in set (0.00 sec)

mysql> SELECT *
    -> FROM audit_log
    -> WHERE user_name = CURRENT_USER()
    -> AND table_name = 'specialties'
    -> AND action_timestamp BETWEEN '2026-02-01' AND '2026-02-28'
    -> ORDER BY action_timestamp DESC;
+--------+----------------+-------------+-------------+-----------+---------------------+
| log_id | user_name      | action_type | table_name  | record_id | action_timestamp    |
+--------+----------------+-------------+-------------+-----------+---------------------+
|      2 | root@localhost | UPDATE      | specialties |         1 | 2026-02-15 00:42:35 |
|      1 | root@localhost | INSERT      | specialties |         4 | 2026-02-15 00:42:27 |
+--------+----------------+-------------+-------------+-----------+---------------------+
2 rows in set (0.00 sec)

mysql> SHOW TABLES;
+-----------------------------------+
| Tables_in_hospitaladminmanagement |
+-----------------------------------+
| audit_log                         |
| doctors                           |
| specialties                       |
+-----------------------------------+
3 rows in set (0.00 sec)

mysql> SELECT TABLE_NAME, COLUMN_NAME, DATA_TYPE
    -> FROM INFORMATION_SCHEMA.COLUMNS
    -> WHERE TABLE_SCHEMA = 'hospitalAdminManagement'
    -> ORDER BY TABLE_NAME;
+-------------+------------------+-----------+
| TABLE_NAME  | COLUMN_NAME      | DATA_TYPE |
+-------------+------------------+-----------+
| audit_log   | log_id           | int       |
| audit_log   | user_name        | varchar   |
| audit_log   | action_type      | varchar   |
| audit_log   | table_name       | varchar   |
| audit_log   | record_id        | int       |
| audit_log   | action_timestamp | timestamp |
| doctors     | doctor_id        | int       |
| doctors     | doctor_name      | varchar   |
| doctors     | specialty_id     | int       |
| specialties | specialty_id     | int       |
| specialties | specialty_name   | varchar   |
+-------------+------------------+-----------+
11 rows in set (0.03 sec)

mysql>