drop table if exists Users;

create table Users
(
    id INT auto_increment primary key ,
    nume varchar(50) not null ,
    password varchar(50) not null ,
    salar varchar(50) not null ,
);
