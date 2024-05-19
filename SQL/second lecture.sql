create database xyz;
use xyz;
create table emp(
emp_id int primary key,
name varchar(50) unique,
salary int not null,
age int default 25				-- If some one doesn't know his age it will store default value otherwise the value which is entered will be considered.

-- primary key(id,name) 		We can also assign the primary key like that the combination of these two coulumn will be unique.
);

insert into emp (id,name,salary)
values
(2,"bob",2500),
(3,"casey",2500);
select*from emp;

create table HR(
id int primary key,
name varchar (50),
Age int
constraint age_check check (age>=19 and name= 'sachin')
);
-- It will check the constraint if it satisfied then it will insert into DB.
insert into hr values(2,'sachin',17);
select*from hr;