create database HealthClinicDB;
show databases;
use HealthClinicDB;

create table Doctor (
DoctorID int auto_increment primary key,
FirstName varchar(50) not null,
LastName varchar(50) not null,
Specialization varchar(100) not null,
Phone varchar(15) unique,
CreatedOn datetime default current_timestamp);

select * from Doctor;

alter table Doctor add Email varchar(50) unique;

select * from Doctor;

insert into Doctor(FirstName, LastName, Specialization, Phone)
values
("Rahul", "Sharma", "General", "7463857463"),
("Ayush", "Sahu", "cardiology", "6574863548");

select DoctorID, FirstName, LastName, Specialization
from Doctor
where Specialization = 'Cardiology';

update Doctor set Email = "rahul@gmail.com" where DoctorID = 1;
select * from Doctor;

delete from Doctor where DoctorID = 1;
select * from Doctor;