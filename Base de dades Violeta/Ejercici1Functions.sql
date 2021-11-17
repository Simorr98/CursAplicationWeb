-- 3.1
select upper(typeP) as result
from centers.plant
where codeP='P_A';
-- 3.2
select ucase(typeP) as result
from centers.plant
where codeP='P_A';
-- 3.3
select lower(typeP) as result
from centers.plant
where codeP='P_B';
-- 3.4
select lcase(typeP) as result
from centers.plant
where codeP='P_B';
-- 3.5 
select length(typeP) as result
from centers.plant
where codeP='P_B';
-- 3.6
select instr(typeP, 'lar') as result
from centers.plant
where codeP='P_B';
-- 3.7
select instr(typeP, 'u') as result
from centers.plant;
-- 3.8
select concat(nameP, ' ', codeP) as result
from centers.plant;
-- 3.9
select concat(nameP, '&', codeP) as result
from centers.plant;
-- 3.10
select concat_ws('-', nameP, codeP) as result
from centers.plant;
-- 3.11
select reverse(typeP) as result
from centers.plant;
-- 3.12
select distinct reverse(typeP) as result
from centers.plant;
-- 3.13
select left(typeP, '2') as result
from centers.plant;
-- 3.14
select distinct left(typeP, '2') as result
from centers.plant;
-- 3.15
select right(typeP, '2') as result
from centers.plant;
-- 3.16
select distinct right(typeP, '2') as result
from centers.plant;
-- 2.1
select codeWC from centers.work_center
order by codeWC ASC;
-- 2.2
select codeWC from centers.work_center
order by codeWC DESC;
-- 2.3
select distinct function_
from centers.work_center
order by function_ ASC;
-- 2.4
select distinct capacity
from centers.work_center
order by capacity ASC;
-- 2.5
select distinct(capacity)
from centers.work_center 
where capacity is not null
order by capacity DESC;
-- 2.6
select * from centers.work_center
where capacity is null;
-- 2.7
select * from centers.work_center
where(capacity > 10 and capacity < 39);
-- 2.8
select * from centers.work_center
where(capacity > 10 and capacity < 39)
order by capacity asc;
-- 2.9 
select distinct capacity
from centers.work_center
where(capacity > 33 and capacity < 50)
order by capacity desc;
-- 2.10
select * from centers.work_center
where (capacity = 30 or capacity = 33 or capacity = 35 or capacity = 36);
-- 2.11
select distinct function_ from centers.work_center
where (capacity = 30);
-- 2.12
select distinct function_ from centers.work_center
where (capacity = 30 or capacity is null);
-- 2.13
select distinct function_ from centers.work_center
where(capacity != 35);
-- 2.14
select * from centers.work_center
where(capacity != 30 and capacity > 35);
-- 2.15
select * from centers.work_center
where(instr(function_, 'infra'));
-- 2.16
select * from centers.work_center
where(instr(function_, 'ment'));
-- 2.17
select * from centers.work_center
where(instr(function_, 'lop'));
