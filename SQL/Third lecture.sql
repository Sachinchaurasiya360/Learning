Create database if not exists students;
use students;

create table if not exists third_year(
roll_no INT PRIMARY KEY,
Name VARCHAR(50) NOT NULL,
city VARCHAR (100),
Marks int
);

INSERT INTO third_year (roll_no,Name,city,Marks)
values(1,'sachin','gopalganj',66),
(2,'Mohan','Bangluru',65),
(3,'Ram','Mumbai',86),
(4,'Shyam','Pune',66);

select*from third_year;
select roll_no,marks from third_year;
select roll_no,marks from third_year where marks>80;
select roll_no,marks from third_year
order by marks desc;
select count(city) from third_year;
select max(marks) from third_year


