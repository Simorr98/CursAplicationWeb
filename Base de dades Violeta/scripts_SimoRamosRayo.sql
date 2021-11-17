create database mecanics;
use mecanics;

create table POBLACIO(
idPoblacio int not null auto_increment,
nomPoblacio varchar(20) not null,
primary key(idPoblacio));

create table TALLER(
idTaller int not null auto_increment primary key,
nomTaller varchar(20) not null);

create table CLIENT(
idCli int not null auto_increment,
nom varchar(20) not null,
llin1 varchar(15) not null,
llin2 varchar(15) null,
idPoblacio int not null,
primary key(idCli),
foreign key (idPoblacio) references POBLACIO(idPoblacio) on update cascade on delete cascade);

create table MECANIC(
idMecanic int not null auto_increment,
idTaller int not null,
primary key(idMecanic),
foreign key(idTaller) references TALLER(idTaller) on update cascade on delete cascade);

create table COTXE(
matricula varchar(15) not null primary key,
marca varchar(20) not null,
idCli int not null,
foreign key(idCli) references CLIENT(idCli) on update cascade on delete cascade);

create table CLIENT_MECANIC(
idCli int not null,
idMecanic int not null,
primary key(idCli, idMecanic),
foreign key(idCli) references CLIENT(idCli) on update cascade on delete cascade);

alter table CLIENT add column telefon int default null;
alter table COTXE modify column marca varchar(25) not null;
alter table CLIENT change column llin2 surn2 varchar(15) null;
alter table COTXE add primary key (model);
alter table CLIENT add primary key (llin1, surn2);
alter table CLIENT_MECANIC add foreign key(idMecanic) references MECANIC(idMecanic) on update cascade on delete cascade;

insert into POBLACIO(nomPoblacio) values
('Inca'),
('Manacor'),
('Palma');

insert into TALLER(nomTaller) values
('Talleres Paco'),
('Talleres Tomeu'),
('Talleres Simo');

insert into CLIENT(nom, llin1, surn2, idPoblacio, telefon) values
('Simo', 'Ramos', null, 1, 23124213),
('Miquel', 'Tortella', 'Tomeu', 2, 23134213),
('Juan', 'Rivero', 'Galan', 3, 321321321);

insert into MECANIC(idTaller) values
(1),
(2),
(3);

insert into COTXE(matricula, marca, idCli) values 
('IB 123', 'Volvo', 1),
('IB 124', 'Ferrari', 2),
('IB 125', 'Nissan', 3);

insert into CLIENT_MECANIC(idCli, idMecanic) values
(1,1),
(2, 2),
(3, 3);

update CLIENT set llin1='Mora' where idCli='1';
update CLIENT set llin1='Adrover' where idCli='2';

select concat(nomTaller, ' $') as result
from TALLER;

select length(nomTaller) as result
from TALLER
where idTaller='1'
group by nomTaller;

select * from COTXE, CLIENT;

select POBLACIO.idPoblacio, CLIENT.nom from POBLACIO
inner join CLIENT using (idPoblacio);

select CLIENT.idCli, COTXE.matricula from CLIENT
inner join COTXE using (idCli)
where idCli > 1
group by COTXE.matricula;

select CLIENT.idCli, CLIENT_MECANIC.idCli, CLIENT_MECANIC.idMecanic
from CLIENT
right join CLIENT_MECANIC on CLIENT.idCli = CLIENT_MECANIC.idCli
order by client.idCli asc;

select MECANIC.idMecanic, CLIENT_MECANIC.idMecanic, CLIENT_MECANIC.idCli
from MECANIC
right join CLIENT_MECANIC on MECANIC.idMecanic = CLIENT_MECANIC.idMecanic
order by MECANIC.idMecanic asc;