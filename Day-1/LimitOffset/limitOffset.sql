create database if not exists company;
use company;
create table employee(id int primary key auto_increment, name varchar(25), salary bigint, location varchar(50));
show tables;
insert into employee (name, salary, location)  values ("Abhi", 50000, "Bhopal"),("Ayush", 45000, "Indore"), ("Rashi", 55000, "Sagar"), ("Palak", 52000, "Sehore");
select * from employee;
alter table employee add role varchar(50);
update employee set role = "manager" where id = 1;
alter table employee modify salary int;
rename table employee to employee_data;
select * from employee_data;
alter table employee_data rename column salary to income;

create table fresher(id int primary key auto_increment, name varchar(50) not null unique, intership varchar(25), age int check (age > 18));

select * from fresher;
select * from  employee_data where name like "a%";
select * from  employee_data where name like "%l%";
select * from  employee_data where name like "%i";

select * from  employee_data where income > 49000;

select * from  employee_data limit 2;
select * from  employee_data limit 2 offset 1;

select * from employee_data order by income desc;
select * from  employee_data where name like "_____";