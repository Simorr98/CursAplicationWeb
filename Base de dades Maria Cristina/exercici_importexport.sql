create database empresa;
use empresa;
create table clientes(
id_cliente int,
nombre varchar(15) not null,
apellido varchar(15) not null,
edad int not null,
telefono int not null,
primary key(id_cliente));

insert into clientes(id_cliente, nombre, apellido, edad, telefono) values
(1, 'Toni', 'Pons', 32, 555552222),
(2, 'Joan', 'Llinar', 33, 555223366),
(3, 'Alfons', 'Muro', 21, 555553211),
(4, 'Lluis', 'Alvar', 32, 322113563),
(5, 'Fonsi', 'Nieto', 27, 332444444);

create table productos(
id_producto int not null,
nombre varchar(15) not null,
descripcion varchar(100) not null,
precio int not null,
primary key(id_producto));

create table pedidos(
id_pedido int auto_increment primary key,
fecha datetime not null,
cantidad int not null,
id_cliente int not null,
id_producto int not null,
foreign key(id_cliente) references clientes(id_cliente),
foreign key(id_producto) references productos(id_producto));

create database empresa2;
use empresa2;

create table clientes(
id_cliente int,
nombre varchar(15) not null,
apellido varchar(15) not null,
edad int not null,
telefono int not null,
primary key(id_cliente));

create table productos(
id_producto int not null,
nombre varchar(15) not null,
descripcion varchar(100) not null,
precio int not null,
primary key(id_producto));

create table pedidos(
id_pedido int auto_increment primary key,
fecha datetime not null,
cantidad int not null,
id_cliente int not null,
id_producto int not null,
foreign key(id_cliente) references clientes(id_cliente),
foreign key(id_producto) references productos(id_producto));

select * into outfile 'C:/Temporal/clients.txt'
from clientes;

load data infile 'C:/Temporal/clients.txt'
into TABLE clientes
fields terminated by ',' enclosed by '"'
lines terminated by '\n';

create database bd_contacts_gmail;
use bd_contacts_gmail;

create table contacts(
nom varchar(20) not null,
cognoms varchar(20) not null,
correu varchar(50) not null,
telefon int not null,
primary key (nom));

load data infile 'C:/Temporal/contacts.csv'
into TABLE contacts
fields terminated by ',' enclosed by '"'
lines terminated by '\n';

create database bd_contacts_gmail2;
use bd_contacts_gmail2;

create table contacts(
idContact int not null auto_increment,
nom varchar(20) not null,
cognoms varchar(20) not null,
correu varchar(50) not null,
telefon int not null,
primary key (idContact));

load data infile 'C:/Temporal/contacts.csv'
into TABLE contacts
fields terminated by ',' enclosed by '"'
lines terminated by '\n';
