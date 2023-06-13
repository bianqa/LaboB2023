drop database if exists prueba;

create database prueba;
use prueba;
create table tabla (
	codigo int primary key auto_increment not null,
    nombre varchar(45)
);

insert into tabla (nombre) values ("lol");