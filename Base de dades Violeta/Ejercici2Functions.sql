use sales;
-- 1.1
select concat(pricePro, ' $') as result
from product;
-- 1.3
select left(pricePro, 5)  as result, pricePro
from product;
-- 1.4
select ceiling(pricePro) as result, pricePro
from product;
-- les dues van be
select round(pricePro) as result, pricePro
from product;
-- 1.5
select floor(pricePro) as result, pricePro
from product;
-- 1.6
select round(15.43823, 2) as result;
-- 1.7
select abs(pricePro) as result, pricePro
from product;
-- 1.8
select sign(pricePro) as result, pricePro
from product;
-- 1.9
select pi();
-- 1.10
select power(3,2);
-- 1.11
select sum(pricePro) * 0.21 as result, pricePro
from product;
-- 1.12
select sum(pricePro + (pricePro * 0.21)) as result, pricePro
from product;
-- 1.13
select sum(3+2) as result;
-- 1.14
select sum(3*2) as result;
-- 1.15
select mod(3,2) as result;
-- 1.16
select sum(10/3) as result;
-- 2.1
select round(((0 + 1) * rand() + 0), 1) as result;
-- 2.2
select round(((18 + 65) * rand() + 1), 0) as result;
-- 3.1
select lpad(codeCity, 4, '&') as result
from CITY;
-- 3.2
select trim(nameCity) as result
from CITY;
-- 3.3
select substring(sizeCity, 3) as result, sizeCity
from CITY;
-- 3.4
select mid(sizeCity, 2, 3) as result from CITY limit 0, 1;
-- 3.5
select substring_index(nameCity, ' ', 1) as result
from CITY where idCity=1;
-- 3.6
select substring_index(nameCity, ' ', -1) as result
from city where idCity=1;
-- 4.1
select replace(dni, substring(dni , 3, 7),'*******') as result
from client;
-- 4.2
select left(phoneNum, 3) as result from client;
-- 5.1
select purchaseDT, date_format(purchaseDT, '%W the %D of %M') from PRODUCT_CLIENT;
-- 5.2
select purchaseDT, date_format(purchaseDT, '%W the %e of %M at %H hour %i minutes and %') from PRODUCT_CLIENT;
-- 5.3

-- 5.4

-- 5.5

-- 5.6

-- 5.7

-- 5.8

-- 5.9

-- 5.10

-- 5.11

-- 5.12

-- 5.13

-- 6.1

-- 6.2

-- 6.3

-- 6.4

-- 6.5
