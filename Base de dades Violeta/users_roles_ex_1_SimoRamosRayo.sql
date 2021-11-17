-- 1:
-- mysql -u root -p 

-- 2:
USE mysql;

-- 3:
SHOW TABLES;

-- 4 and 5:
SELECT * FROM user;
SELECT * FROM db;

-- 6:
SHOW GRANTS FOR 'root'@'localHost';
-- 7:
SELECT host, user FROM user WHERE user='root';

-- 8:
-- El % s'usa per establir una conecció desde qualsevol lloc. Exemple: 'root'@'%'.

-- 9:
CREATE USER 'sramos'@'localhost'
  IDENTIFIED BY '9876';
GRANT ALL
  ON *.*
  TO 'sramos'@'localhost'
  WITH GRANT OPTION;
  
-- 10:
SELECT host, user FROM user WHERE user='sramos';
SELECT host, db, user FROM db WHERE user='sramos';
SHOW GRANTS FOR 'sramos'@'localHost';

-- 11:
CREATE USER 'guest_user'@'localhost'
  IDENTIFIED BY '9876';
GRANT SELECT, SHOW VIEW, UPDATE
  ON *.*
  TO 'guest_user'@'localhost';

-- 12:
SELECT host, user FROM user WHERE user='guest_user';
SELECT host, db, user FROM db WHERE user='guest_user';
SHOW GRANTS FOR 'guest_user'@'localHost';

-- 13:
RENAME USER 'guest_user'@'localhost' TO 'limited_user'@'localhost';

-- 14:
REVOKE UPDATE
  ON *.*
  FROM 'limited_user'@'localhost';
  
-- 15:
SELECT host, user FROM user WHERE user='limited_user';
SELECT host, db, user FROM db WHERE user='limited_user';
SHOW GRANTS FOR 'limited_user'@'localHost';

-- 16:
REVOKE ALL ON *.* FROM 'limited_user'@'localHost';
  
-- 17:
DROP USER 'limited_user'@'localHost';

-- 18:
CREATE USER 'developer_user'@'localhost'
  IDENTIFIED BY '9876';
GRANT SELECT, INSERT, UPDATE
  ON *.*
  TO 'developer_user'@'localhost';
  
GRANT SHOW DATABASE
  ON *.*
  FROM 'developer_user'@'localHost';

GRANT CREATE, ALTER
  ON *.*
  TO 'developer_user'@'localHost';
  
-- 19:
SELECT host, user FROM user WHERE user='developer_user';
SELECT host, db, user FROM db WHERE user='developer_user';
SHOW GRANTS FOR 'developer_user'@'localHost';

-- 20:
RENAME USER 'developer_user'@'localhost' TO 'dev_user'@'localhost';

-- 21:
REVOKE SHOW DATABASES
  ON *.*
  FROM 'dev_user'@'localHost';
  
-- 22:
SELECT host, user FROM user WHERE user='dev_user';
SELECT host, db, user FROM db WHERE user='dev_user';
SHOW GRANTS FOR 'dev_user'@'localHost';

-- 23:
REVOKE UPDATE, ALTER
  ON *.*
  FROM 'dev_user'@'localHost';
  
-- 24:
DROP USER 'dev_user'@'localHost';