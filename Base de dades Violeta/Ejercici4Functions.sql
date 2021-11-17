create database bookshop;
use bookshop;
create table EDITORIAL(
idE int not null auto_increment primary key,
nameE varchar(15) not null,
addressE varchar(50) not null,
cityE int not null);

create table CITY(
idCity int not null auto_increment primary key,
codeCity varchar(5) not null,
nameCity varchar(30) not null,
sizeCity enum('Small', 'Medium', 'Large') not null);

create table BOOK(
idB int not null auto_increment primary key,
titleB varchar(30) not null,
languageB char not null,
numPagsB int not null,
idE int not null,
foreign key (idE) references EDITORIAL(idE));

insert into EDITORIAL(nameE, addressE, cityE) values
('Rama', '144 canillas street', 3),
('Addison', '4 sunset street', 2),
('McGraw-Hill', '181 avenue', 1),
('paraninfo', '8 Goya square', 1),
('Anay', '3 sun lane', 2);

insert into CITY(codeCity, nameCity, sizeCity) values
('PMI', 'Palma de Mallorca', 'Small'),
('VLC', 'Valencia', 'Medium'),
('MAD', 'Madrid', 'Large');

insert into BOOK(titleB, languageB, numPagsB, idE) values
('BD analysis', 'E', 120, 1),
('A guide to SQL', 'E', 124, 2),
('BBDD NoSQL', 'S', 167, 1),
('ER Model', 'E', 94, 1),
('Relational Model', 'E', 85, 2);

-- 1.1
select * from editorial, city;
-- 1.2
select * from editorial, book;
-- 1.3
select * from city, book;
-- 1.4
select editorial.cityE, city.idCity 
from editorial
inner join city on editorial.cityE = city.idCity;
-- 1.5
select editorial.idE, book.idE from editorial
inner join book using(idE);
-- altre opcio
select editorial.idE, book.idE from editorial
inner join book on editorial.idE = book.idE;
-- 1.6
-- No se pot fer perque no tenen ninguna taula en comú
-- 1.7
-- La diferencia es que el producte cartesià el pots aplicar entre dues taules aunque no 
-- estiguin relacionades, i el inner join necessiten estar relacionades en clau principal
-- i clau foranea
-- 1.8
select nameE, nameCity from editorial 
inner join city on cityE =idCity
where nameE like 'Addison';
-- 2.1
select count(idE) as result, cityE
from editorial group by cityE;
-- 2.2
select count(idE) as result, cityE 
from editorial
group by cityE having count(idE) >= 2;
-- 3.1
select count(idB) as result, languageB
from book
group by languageB;
-- 3.2
select count(idB) as result, languageB
from book
group by languageB having count(languageB) >= 3;
-- 3.3
select avg(numPagsB) as result, languageB
from book
group by languageB;
-- 3.4
select avg(numPagsB) as result, languageB
from book
group by languageB having avg(numPagsB) <= 167;
-- 3.5
select std(numPagsB) as result, idE
from book
group by idE;
-- 3.6
select std(numPagsB) as result, idE
from book
group by idE having std(numPagsB) < 20;
-- 3.7
select std(numPagsB) as result, idE
from book
where numPagsB > 90
group by idE;
-- 3.8
select avg(numPagsB) as result, languageB
from book
where numPagsB < 90
group by languageB
having avg(numPagsB) < 87;
-- 3.9
select std(numPagsB) as result, idE
from book
where numPagsB > 90
group by idE
having std(numPagsB) > 30;
-- 3.10
select avg(numPagsB) as result, languageB
from book
group by languageB;