create database prova;

use prova;

create table ciutat (
id integer not null,
nom varchar(30) not null);

create table client(
id integer not null, 
nom varchar(30) not null,
llinatge1 varchar(30) not null,
llinatge2 varchar(30));

insert into ciutat values (1, "Porreres");
insert into client values(1, "Maria", "Adrover", "Rivero");

/* Afegim una clau primària */
alter table ciutat add primary key (id);
alter table client add primary key(id);
/*Comprovar si la primary s'ha afegit*/
describe ciutat;
describe client;

/*Crear una columna per fer la foreign key*/
alter table client add column id_ciutat integer;

/*Següent instruccio dona error perque ja hi ha registres amb ciutat null*/
alter table client modify column id_ciutat integer not null;

/*Afegir foreing key*/
alter table client add foreign key (id_ciutat) references ciutat(id);
insert into client(id,nom,llinatge1,llinatge2) values (2, "Joana", "Serra", "Bonet");

/*El següent registre no el deixa introduïr perque no existeix la ciutat 2*/
insert into client(id,nom,llinatge1,llinatge2) values (3, "Joan", "Serra", "Barceló", 2);

/*Introduim un valor fictici de ciutat a tots els registres de client per tal de*/
/*no tenir cap registre amb la ciutat nulla*/
insert into ciutat (id,nom) values (2, "Ficticia");
SET SQL_SAFE_UPDATES = 0;
update client set id_ciutat =2;

/*Ara si que puc fer afegir que el camp ciutat és not null*/
alter table client modify column id_ciutat integer not null;

/*Ara faltarien els diferents updates per assignar updates per assignar a cada client la ciutat*/
/*corresponent no la ficticia*/
