create database prova;

use prova;

create table client(
id int,
nom varchar(10));

insert into client(id, nom) values(1, 'Joan');

-- afergir una columna
alter table client add column llinatge1 varchar(30) not null;
alter table client add column llinatge2 varchar(30);

-- modificar una columna
alter table client modify column llinatge1 varchar(50) not null;
alter table client add column punts int;

-- borrar una columna
alter table client drop column punts;

-- canviar es nom de sa taula
rename table cliente to client; 

-- Si dona error 1175 de update
SET SQL_SAFE_UPDATES = 0;
update client set llinatge1="Mora" where id=1;
update client set llinatge2="Adrover" where id=1;

describe client;