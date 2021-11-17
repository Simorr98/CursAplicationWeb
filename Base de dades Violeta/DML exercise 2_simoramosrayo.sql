use centers;

-- 0 Create table routing  
create table routing(
idR int auto_increment,
statusR varchar(15),
primary key(idR));

-- 1 Inserts into routing
insert into routing (statusR) values ('up'), ('up'), ('up'), ('up'),
 ('down'), ('down'), ('down'), ('down'),
 ('other'), ('other');
 
-- 2 Create table material
create table material(
IdMaterial int auto_increment,
NameM enum('paper', 'plastic', 'metal', 'other') not null default('paper'),
primary key(IdMaterial));

-- 3 Inserts into material
insert into material (NameM) values ('paper'), ('paper'), ('paper'),
 ('plastic'), ('plastic'), ('plastic'),
 ('metal'), ('metal'), ('metal'),
 ('other');
 
-- Create table material-external
create table material_external(
IdMaterial int auto_increment,
Provider varchar(15),
primary key(IdMaterial, Provider));

-- Inserts into material-external
insert into material_external (Provider) values ('Prov_ext_1'), ('Prov_ext_2'), ('Prov_ext_3'),
 ('Prov_ext_4'), ('Prov_ext_5'), ('Prov_ext_6'), ('Prov_ext_7'),
 ('Prov_ext_8'), ('Prov_ext_9'), ('Prov_ext_10'); 
 
-- Create table material-internal 
create table material_internal(
IdMaterial int auto_increment,
Departament varchar(15),
primary key(IdMaterial));

-- Inserts into material-internal
insert into material_internal (Departament) values ('Dep_int_1'), ('Dep_int_2'), ('Dep_int_3'), 
('Dep_int_4'), ('Dep_int_5'), ('Dep_int_6'), ('Dep_int_7'), 
('Dep_int_8'), ('Dep_int_9'), ('Dep_int_10');

-- 4 Update into routing
update routing set statusR='down'
where idR=1;

update routing set statusR='down'
where idR=4;

update routing set statusR='up'
where idR=5;

update routing set statusR='other'
where idR=6;

update routing set statusR='up'
where idR=7;

update routing set statusR='other'
where idR=8;

update routing set statusR='up'
where idR=9;

update routing set statusR='up'
where idR=10;

-- 5 Update into material
update material set NameM='metal'
where IdMaterial=1;

update material set NameM='paper'
where IdMaterial=4;

update material set NameM='plastic'
where IdMaterial=7;

update material set NameM='other'
where IdMaterial=9;

update material set NameM='paper'
where IdMaterial=10;

-- 6 Replace into routing
replace into routing (idR, statusR) values (2, 'other');
replace into routing (idR, statusR) values (3, 'down');

-- 7 Replace into material
replace into material (IdMaterial, NameM) values(2, 'metal');
replace into material (IdMaterial, NameM) values(3, 'other');

-- 8 Delete from routing
delete from routing where idR=5;
delete from routing where idR=8;

-- 9 Delete from material
delete from material where IdMaterial=6;
delete from material where IdMaterial=8;

-- 10 Update into material-external
update material_external set Provider='Prov_ext_1'
where IdMaterial=2;

update material_external set Provider='Prov_ext_3'
where IdMaterial=4;

update material_external set Provider='Prov_ext_1'
where IdMaterial=7;

update material_external set Provider='Prov_ext_5'
where IdMaterial=10;

-- 11 Update into material-internal
update material_internal set Departament='Dep_int_1'
where IdMaterial=2;

update material_internal set Departament='Dep_int_3'
where IdMaterial=4;

update material_internal set Departament='Dep_int_1'
where IdMaterial=7;

update material_internal set Departament='Dep_int_5'
where IdMaterial=10;

-- 12 Replace into material-external
replace into material_external (IdMaterial, Provider) values (1, 'Prov_ext_10');
replace into material_external (IdMaterial, Provider) values (6, 'Prov_ext_3');

-- 13 Replace into material-internal
replace into material_internal (IdMaterial, Departament) values (1, 'Dep_int_10');
replace into material_internal (IdMaterial, Departament) values (6, 'Dep_int_3');

-- 14 Delete from material-external
delete from material_external where IdMaterial=5;
delete from material_external where IdMaterial=9;

-- 15 Delete from material-internal
delete from material_internal where IdMaterial=3;
delete from material_internal where IdMaterial=5;
delete from material_internal where IdMaterial=9;

