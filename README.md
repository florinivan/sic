# sic

# Create table space and user for sic
create tablespace PHIMESTABLESPACE datafile 'C:\oraclexe\app\oracle\oradata\XE\PHIMESTABLESPACE.dbf' 
size 32m autoextend on 
next 32m maxsize 2048m extent management local;

CREATE USER phimes IDENTIFIED BY "Start@123" 
DEFAULT TABLESPACE "PHIMESTABLESPACE" 
TEMPORARY TABLESPACE "TEMP";

ALTER USER phimes QUOTA UNLIMITED ON PHIMESTABLESPACE;

GRANT ALL PRIVILEGES TO phimes;
