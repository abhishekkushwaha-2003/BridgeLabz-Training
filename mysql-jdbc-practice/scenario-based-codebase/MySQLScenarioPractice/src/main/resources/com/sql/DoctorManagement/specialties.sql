mysql> Create database mysqlScenarioPractice;
Query OK, 1 row affected (0.10 sec)

mysql> use mysqlScenarioPractice
Database changed

mysql> CREATE TABLE specialties (
    ->     specialty_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     specialty_name VARCHAR(100) UNIQUE NOT NULL
    -> );
Query OK, 0 rows affected (0.13 sec)

mysql> CREATE TABLE doctor (
    ->     doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    ->     doctor_name VARCHAR(100) NOT NULL,
    ->     specialty_id INT,
    ->     phone VARCHAR(15) UNIQUE,
    ->     consultation_fee DECIMAL(8,2),
    ->     is_active BOOLEAN DEFAULT TRUE,
    ->     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ->
    ->     FOREIGN KEY (specialty_id)
    ->         REFERENCES specialties(specialty_id)
    -> );
    
Query OK, 0 rows affected (0.11 sec)

mysql> INSERT INTO specialties (specialty_name)
    -> VALUES
    -> ('Cardiology'),
    -> ('Neurology'),
    -> ('Orthopedics'),
    -> ('Dermatology');
    
Query OK, 4 rows affected (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> SELECT * FROM specialties;
+--------------+----------------+
| specialty_id | specialty_name |
+--------------+----------------+
|            1 | Cardiology     |
|            4 | Dermatology    |
|            2 | Neurology      |
|            3 | Orthopedics    |
+--------------+----------------+
4 rows in set (0.00 sec)