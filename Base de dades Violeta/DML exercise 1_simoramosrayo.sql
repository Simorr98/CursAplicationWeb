create database centers;
use centers;
create table Activity(
idActivity integer not null auto_increment,
intensity varchar(15) not null,
primary key (idActivity));
insert Activity(intensity) values ("high");
insert Activity(intensity) values ("high");
insert Activity(intensity) values ("high");
insert Activity(intensity) values ("medium");
insert Activity(intensity) values ("medium");
insert Activity(intensity) values ("medium");
insert Activity(intensity) values ("low");
insert Activity(intensity) values ("low");
insert Activity(intensity) values ("low");
insert Activity(intensity) values ("other");
create table Plant(
codeP varchar(3) not null,
nameP varchar(7) not null,
typeP varchar(15) not null,
primary key(codeP));
insert Plant(codeP, nameP, typeP) values("P_A","plant_A","circular");
insert Plant(codeP, nameP, typeP) values("P_B","plant_B","circular");
insert Plant(codeP, nameP, typeP) values("P_C","plant_C","circular");
insert Plant(codeP, nameP, typeP) values("P_D","plant_D","square");
insert Plant(codeP, nameP, typeP) values("P_E","plant_E","square");
insert Plant(codeP, nameP, typeP) values("P_F","plant_F","square");
insert Plant(codeP, nameP, typeP) values("P_G","plant_G","triangular");
insert Plant(codeP, nameP, typeP) values("P_H","plant_H","triangular");
insert Plant(codeP, nameP, typeP) values("P_I","plant_I","triangular");
insert Plant(codeP, nameP, typeP) values("P_J","plant_J","other");
create table Work_Center(
codeWC varchar(4) not null,
function_ varchar(15) not null,
capacity integer null,
primary key(codeWC));
insert Work_Center(codeWC, function_, capacity) values("WC_A", "supervision", 30);
insert Work_Center(codeWC, function_, capacity) values("WC_B", "supervision", 35);
insert Work_Center(codeWC, function_, capacity) values("WC_C", "supervision", 40);
insert Work_Center(codeWC, function_, capacity) values("WC_D", "infrastructure", 30);
insert Work_Center(codeWC, function_, capacity) values("WC_E", "infrastructure", 35);
insert Work_Center(codeWC, function_, capacity) values("WC_F", "infrastructure", 40);
insert Work_Center(codeWC, function_, capacity) values("WC_G", "development", 30);
insert Work_Center(codeWC, function_, capacity) values("WC_H", "development", 35);
insert Work_Center(codeWC, function_, capacity) values("WC_I", "development", 40);
insert Work_Center(codeWC, function_, capacity) values("WC_J", "other", null);


