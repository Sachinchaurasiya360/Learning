create database if not exists college;  -- creating a database
use college; 				-- Now instructing it for use college name database
-- Drop database name        it is used to delete the database we can also include if exsist
create table student (		-- Now we have the database so we have to create diffrent table in it this is first table
roll_no int primary  key,	-- first data is roll no which is int and primary key
name varchar(50),			-- varchar use for storing string 
age int not null			-- age which can't be null 
);

insert into student values(1,"Sachin chaurasiya", 19);	-- Now inserting the value in the database 
insert into student values (2,"Sachin", 15);
insert into student values(3," chaurasiya", 13);

select *from student;									-- Printing the value of stored database

show tables ;				-- It will show all the taable which is present in the database