
CREATE DATABASE IF NOT EXISTS adlister_db;
SHOW DATABASES;

CREATE USER 'adlisteruser'@'localhost' IDENTIFIED BY 'adlisteruserpassword';

GRANT ALL ON adlister_db.* TO 'adlisteruser'@'localhost';

SHOW GRANTS FOR 'adlisteruser'@'localhost';



