use bookshop;
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
inner join city on cityE = idCity
where nameE like 'Addison';
-- 1.9
select nameE, nameCity	 from editorial 
inner join city on cityE = idCity
where sizeCity like 'Small';
-- 1.10
select count(distinct idE) as result, nameCity, nameE
from editorial
inner join city on cityE = idCity
group by nameCity;
-- 1.11
select count(idE) as result, nameE
from editorial
inner join book onityE using(idE) where nameE = 'Addison'
group by idE;
-- 1.12
select count(idB) as result, nameE
from editorial inner join book
using(idE) where languageB = 'E' and numPagsB > 100;
-- 1.13

-- 1.14

-- 1.15

-- 1.16

-- 1.17

-- 1.18

-- 1.19

-- 1.20
