create database SBIbank;
use SBIbank;
create table singup(formno varchar(20), Cname varchar(20),fname varchar(20),dob varchar(20),gen varchar(20),
married varchar(20),email varchar(30), city varchar(20), state varchar(20), pin varchar(20));
show tables;
create table singuptwo(formno varchar(20), rels varchar(20),cats varchar(20),incs varchar(20),education varchar(20),
occupation varchar(20),Existing_ac  varchar(30), pannumber varchar(20), aadhrnumber varchar(20), seniorcitizen varchar(20));
create table signup3(formno varchar(20), acctype varchar(20),cardnumber varchar(40),pinnumber varchar(10),facility varchar(20));
create table login(formno varchar(20), cardnumber varchar(40),pinnumber varchar(10));
create table Details(pin varchar(10),date varchar(50),type varchar(20),amount varchar(20));
show tables;
 select * from singup;
 select * from singuptwo;
 select * from signup3;
 
 select * from Details;
 select * from login;
 drop table Details;
 truncate table singup;
