drop database sales;
create database sales;
use sales;


create table CITY (
idCity int auto_increment,
codeCity varchar(5) not null,
nameCity varchar(30) not null,
sizeCity enum('small', 'medium', 'large') default 'medium' null,
primary key(idCity),
unique index(codeCity)
);


create table CLIENT (
idCli int auto_increment not null,
dni varchar(11) not null,
nameCli varchar(30) not null,
sum1Cli varchar(30) not null,
sum2Cli varchar(30) null default null,
phoneNum int null default null,
phoneType enum('Landline', 'mobile'),
idCity int not null,
primary key (idCli),
foreign key (idCity) references CITY(idCity));

create table PRODUCT (
idPro int auto_increment,
codePro varchar(5) not null,
namePro varchar(15) not null,
descripPro varchar(50) null,
pricePro float not null default 0,
primary key(idPro),
unique index(idPro)
);

create table PRODUCT_CLIENT (
idPro int not null,
idCli int not null,
purchaseDT datetime not null default current_timestamp,
primary key(idpro, idCli),
foreign key (idPro) references PRODUCT(idPro) on update cascade on delete cascade,
foreign key (idCli) references CLIENT(idCli) on update cascade on delete cascade);



-- -------------------------------------------
use sales;

insert into CITY (codeCity, nameCity, sizeCity)values
("PMI", "Palma de Mallorca", 'small'),
("VLC", "Valencia", 'medium'),
("MAD", "Madrid", 'large');

insert into CLIENT (dni, nameCli, sum1Cli, sum2Cli, phoneNum, phoneType, idCity)values
("11111111A", "Wendoline", "Sun", NULL, 999999999, 'mobile', 1),
("11111112A", "Many", "Moon", "Garcia", 971002233, 'Landline', 1),
("11111113A", "Charlie", "Mars", NULL, NULL, 'mobile', 2),
("11111114A", "Carolina", "Cosbi", "Fernandez", NULL, 'mobile', 2),
("11111115A", "Alexandra", "Brown", NULL, NULL, NULL, 2);

insert into PRODUCT (codePro, namePro, descripPro, pricePro)
values ("PRO_A", "Mouse", NULL, 10.554),
("PRO_B", "Keyboard", NULL, 20.432),
("PRO_C", "Screen", NULL, 120.712),
("PRO_D", "CPU", NULL, 70.103),
("PRO_E", "RAM memory", NULL, 45.871);

insert into PRODUCT_CLIENT (idPro, idCli)
values (1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 2);

-- Modify Table
-- Exercici 1
alter table client rename to TBL_CLIENT;
-- Exercici 2
alter table TBL_CLIENT rename column phoneNum to phone_num;
alter table TBL_CLIENT modify column phone_num int default 0;
-- el change fa el mateix que les dues instruccions anteriors
alter table TBL_CLIENT change column phoneNum phone_num int default 0;
-- Exercici 3
alter table TBL_CLIENT modify column phoneType enum('Landline','mobile') null default 'mobile';
-- Exercici 4
alter table CITY add column code_country varchar(5) not null;
alter table CITY add unique index index_code_country (code_country);
-- Exercici 5
alter table CITY drop index index_code_country;
-- Exercici 6
alter table PRODUCT_CLIENT drop column purchaseDT;
-- Exercici 7
drop table PRODUCT_CLIENT;
-- Si que hem deixa esborrar la taula perque no hi ha ningun valor al dedins
-- En el cas que hi hagues valors dedins, hauria de esborrar les foreign keys que te, i llavors si que hem deixaria borrar la taula