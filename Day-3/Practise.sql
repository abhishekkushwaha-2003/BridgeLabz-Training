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


create database temp3;
use temp3;
create table students(id int, name varchar(50), age int);
insert into students values (1, "Abhi", 23);
select * from students;

show tables;

delimiter $$
create procedure showData()
begin 
select * from students;
end $$
delimiter ;

call showData();

SHOW PROCEDURE STATUS
WHERE Db='temp3';


create database triggerPractise;
show databases;
use triggerPractise;
create table one (id int, name varchar(10));

create table two (id int, name varchar(10));

DELIMITER $$ -- not compulsory
create trigger tgr
after insert 
on one
for each row
begin
insert into two (id, name) values (new.id, new.name);
end$$
DELIMITER ;

SHOW TRIGGERS;

SHOW CREATE TRIGGER tgr;

select * from one;
select * from two;

insert into one(id, name) values (1, "Abhishek");

select * from one;
select * from two;


create database functionPractise;
use functionPractise;

delimiter $$
create function square(num int)
returns int
deterministic
begin 
return num * num;
end$$;
delimiter ;

select square(10);

delimiter $$
create function greeting(str varchar(100))
returns varchar(100)
deterministic
begin 
return concat('Good Morning ', str);
end $$;
delimiter ;

select greeting("Abhishek");

DROP FUNCTION greeting;
