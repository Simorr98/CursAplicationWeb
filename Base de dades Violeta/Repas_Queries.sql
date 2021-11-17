-- et diu la longitud del valor introduit
select char_length(intensity) as stringLength, intensity
from centers.activity;

select instr('Mysql', 'y');
-- ens diu en quina posicio esta el caracter introduit
select instr(intensity, 'o') as result, intensity
from centers.activity;

-- compara si son iguals els valors introduits
select STRCMP('alo','alo'),  -- igual
STRCMP('aef','aef'), -- igual
STRCMP('aef','def'); -- diferent
-- diu si intensity es igual a low
select strcmp(intensity, 'low') as result, intensity
from centers.activity;
-- ensenya la paraula al reves
select reverse(intensity) as result, intensity
from centers.activity;
-- agafa les dues primers lletres de l'esquerra
select left(intensity, 2) from centers.activity;
-- concatena els valor introduits
select concat('A', '-', 'Z');

select concat('intensity is', ' =') as result, intensity
from centers.activity;
-- pasa el valor a minuscula
select lower('MYSQL');
-- pasa el valor a mayuscula
select upper(intensity) as result, intensity 
from centers.activity;
-- afegeix el numero que li diguis i que falti del caracter introduit cap a l'esquerra
select lpad('MySQL', 5, '.');
select lpad(intensity, 8,'-') as result , intensity
from centers.activity;
-- afegeix el numero que li diguis i que falti del caracter introduit cap a la dreta
select rpad('MySQL', 20, '.');
select rpad(intensity, 8,'-') as result , intensity
from centers.activity;
-- imprimeix tot lo de la dreta a partir de on li especifiquis
select substring_index('training@mysql.com', '@',1) as result;
select substring_index('training.ddbb.if33a.iesmanacor@mysql.com', '.',2) as result;
select substring_index('training.ddbb.if33a.iesmanacor@mysql.com', '.',-3) as result;