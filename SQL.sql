create table student(
s_id number(10) primary key,
s_firstname varchar2(100) not null,
s_lastname varchar2(100) not null,
s_level int not null,
s_course1 varchar2(5) null,
s_course2 varchar2(5) null,
s_course3 varchar2(5) null,
s_course4 varchar2(5) null,
s_course5 varchar2(5) null,
s_payment number(7) not null,
s_balance number(7) not null
);

drop table student;

select * from student;
select * from gu;