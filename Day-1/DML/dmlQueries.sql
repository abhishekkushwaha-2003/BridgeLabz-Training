create database if not exists cricket;
use cricket;
create table players(id int primary key auto_increment, name varchar(50), runs int, country varchar(50), age int);

INSERT INTO players (name, runs, country, age)
VALUES
("Virat Kohli", 9230, "India", 37),("Rohit Sharma", 6574, "India", 38),("Shikhar Dhawan", 5647, "India", 36),("MS Dhoni", 7658, "India", 42);
select * from players;

update players set runs = 6853 where id = 4;
select * from players;

delete from players where id = 4;

INSERT INTO players (name, runs, country, age)
VALUES
("AB De Villers", 6467, "South Africa", 39);

select * from players where age > 38;

select * from players where age = 38 or age = 39;

select * from players limit 2 offset 1;
select * from players limit 1, 2;

select * from players where name LIKE "v%";

select * from players order by name asc;

select * from players order by runs desc;

INSERT INTO players (name, runs, country, age)
VALUES
("Steve Smith", 9785, "Australia", 36),
("Joe Root", 11234, "England", 35),
("Kane Williamson", 8123, "New Zealand", 34),
("Babar Azam", 5412, "Pakistan", 31);

select * from players;

update players set runs = 9250, age = 38 where id = 1;
select * from players;

set sql_safe_updates = 0;
delete from players where runs < 6000;
set sql_safe_updates = 1;

select * from players;

select * from players where age between 38 and 40;


select distinct country from players;

select * from players where country in ("India", "Australia");

select * from players;