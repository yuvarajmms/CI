DROP TABLE IF EXISTS SALES;
DROP TABLE IF EXISTS DEPARTMENT;

CREATE TABLE SALES(
   sales_id INT auto_increment primary key,
   name VARCHAR(250) not null,
   category VARCHAR(250) not null,
   location VARCHAR(250) not null
);

CREATE TABLE DEPARTMENT(
  dept_id INT auto_increment primary key,
  name VARCHAR(250) not null,
  manager VARCHAR(250) not null
);

insert into DEPARTMENT values (null,'Accounts','Ben H');
insert into DEPARTMENT values (null,'Sales','Chris J');
insert into DEPARTMENT values (null,'Dev','Kartik M');

insert into SALES values (null,'VP North','Sales In Charge','Chennai');
insert into SALES values (null,'VP South','HR Head','Madurai');
insert into SALES values (null,'Sales Head','Sale PRO','Salem');