use sakila;
select * into outfile 'C:/Temporal/country20210414.txt'
from country;

select * into outfile 'C:/Temporal/country20210414.csv'
fields terminated by ',' enclosed by '"'
lines terminated by '\n'
from country;