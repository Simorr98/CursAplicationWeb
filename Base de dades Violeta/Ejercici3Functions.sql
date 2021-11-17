use sales;
-- 1.1
select count(idCli) from client;
-- 1.2
select count(sum2Cli) from client;
-- 1.3
select count(*) as result from client;
-- 1.4
select count(phoneNum) from client;
-- 1.5
select count(idCli) from client;
-- 1.6
select count(idCity) from client;
-- 1.7
select count(idCity) from client 
where(idCity = 1);
-- 1.8
select count(idCity) from client 
where(idCity = 2);
-- 2.1
select count(idPro) from product;
-- 2.2
select count(descripPro) from product;
-- 2.3
select count(*) from product where descripPro is null;
-- 2.4
select max(pricePro) from product;
-- 2.5
select max(pricePro) as result, namePro from product;
-- 2.6
select min(pricePro) from product;
-- 2.7
select min(pricePro) as result, namePro from product;
-- 2.8
select avg(pricePro) from product;
-- 2.9
select round(avg(pricePro), 2) from product;
-- 2.10
select std(pricePro) from product;
-- 2.11
select round(std(pricePro), 2) from product;
-- 2.12
select sum(pricePro) from product;
-- 3.1
select count(idPro) from product_client;
-- 3.2
select count(distinct purchaseDT) from product_client;
-- 3.3
select count(idCli) from product_client;
-- 3.4
select count(idCli) as client1 from product_client where (idCli = 1);
-- 3.5
select count(idCli) as client2 from product_client where (idCli = 2);