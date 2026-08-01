-- Database created
CREATE DATABASE IF NOT EXISTS Team;
SHOW DATABASES;
USE Team;

-- Table created 
CREATE TABLE Players(id INT PRIMARY KEY, name VARCHAR(50) NOT NULL, runs INT, country VARCHAR(50), age INT);
SELECT * FROM Players;

-- Alter Table
ALTER TABLE Players ADD Format VARCHAR(10); 
SELECT * FROM Players;

-- Rename Table
RENAME TABLE Players TO TeamPlayers;
SHOW TABLES;

-- Modify Datatype
ALTER TABLE TeamPlayers MODIFY runs VARCHAR(50);
SELECT * FROM TeamPlayers;

ALTER TABLE TeamPlayers DROP COLUMN Format;
SELECT * FROM TeamPlayers;

-- Create Table
CREATE TABLE Batsman(id int primary key, name varchar(50), age int);
SELECT * FROM Batsman;

-- Truncate Table
TRUNCATE TABLE Batsman;

-- Drop Table
DROP TABLE Batsman;