CREATE TABLE PRF_ACCESS
   ("ID_ACCESS" CHAR(1) NOT NULL, 
	"DESCRIPTION" VARCHAR2(64) NOT NULL, 
	"ACCESS_ORDER" NUMBER(5,0) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL)
 

   COMMENT ON COLUMN "PHIMES"."PRF_ACCESS"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_ACCESS"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_ACCESS"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_ACCESS"."MODIFY_UT" IS 'technicians';
   
   
    CREATE OR REPLACE TRIGGER PRF_ACCESS_CREATE_TS
    BEFORE INSERT ON PRF_ACCESS
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_ACCESS_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_ACCESS_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_ACCESS
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_ACCESS_MODIFY_TS ENABLE;
   
   
   ALTER TABLE PRF_ACCESS
   ADD CONSTRAINT PRF_ACCESS_PK PRIMARY KEY (ID_ACCESS);
   
   ALTER TABLE PRF_ACCESS ADD CONSTRAINT "PRF_ACCESS_UQ" UNIQUE ("DESCRIPTION","ACCESS_ORDER");
   
   
    
    
    
   
CREATE TABLE PRF_APPLICATION
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL, 
	"ID_STATE" CHAR (1) NOT NULL,
    "CODE" VARCHAR2(16) NOT NULL, 
	"DESCRIPTION" VARCHAR2(64) NOT NULL, 
	"DOMAIN_CODE" VARCHAR2(16) NOT NULL, 
	"PROFILING_DATES" CHAR(1) NOT NULL, 
	"JUMP_PROFILING" CHAR(1) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL)
	 

   COMMENT ON COLUMN "PHIMES"."PRF_APPLICATION"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_APPLICATION"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_APPLICATION"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_APPLICATION"."MODIFY_UT" IS 'technicians';
   
   CREATE SEQUENCE PRF_APPLICATION_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

  CREATE OR REPLACE TRIGGER PRF_APPLICATION_TRG
  BEFORE INSERT ON PRF_APPLICATION
  FOR EACH ROW
BEGIN
  :NEW.ID_APPLICATION := PRF_APPLICATION_seq.nextval;
END;
/
ALTER TRIGGER PRF_APPLICATION_TRG ENABLE;


    CREATE OR REPLACE TRIGGER PRF_APPLICATION_CREATE_TS
    BEFORE INSERT ON PRF_APPLICATION
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_APPLICATION_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_APPLICATION_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_APPLICATION
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_APPLICATION_MODIFY_TS ENABLE;
 

ALTER TABLE PRF_APPLICATION
   ADD CONSTRAINT PRF_APPLICATION_PK PRIMARY KEY (ID_APPLICATION);
   
   ALTER TABLE PRF_APPLICATION ADD CONSTRAINT "PRF_APPLICATION_UQ" UNIQUE ("CODE");
   
   ALTER TABLE PRF_APPLICATION
ADD CONSTRAINT PRF_CK_APP_PROFILING_DATES CHECK (PROFILING_DATES IN ('Y','N') );

ALTER TABLE PRF_APPLICATION
    ADD CONSTRAINT PRF_CK_APP_JUMP_PROFILING CHECK (JUMP_PROFILING IN ('Y','N'));
    
    
    
    


CREATE TABLE PRF_AREA
   ("ID_AREA" NUMBER(22,0) NOT NULL, 
    "ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_STATE" CHAR(1) NOT NULL,
    "CODE" VARCHAR2(16) NOT NULL, 
    "DESCRIPTION" VARCHAR2(64) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL) 
	 
 

   COMMENT ON COLUMN "PHIMES"."PRF_AREA"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_AREA"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_AREA"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_AREA"."MODIFY_UT" IS 'technicians';
   
   
   CREATE SEQUENCE PRF_AREA_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

  CREATE OR REPLACE TRIGGER PRF_AREA_TRG
  BEFORE INSERT ON PRF_AREA
  FOR EACH ROW
BEGIN
  :NEW.ID_AREA := PRF_AREA_seq.nextval;
END;
/
ALTER TRIGGER PRF_AREA_TRG ENABLE;

 CREATE OR REPLACE TRIGGER PRF_AREA_CREATE_TS
    BEFORE INSERT ON PRF_AREA
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_AREA_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_AREA_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_AREA
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_AREA_MODIFY_TS ENABLE;
 

ALTER TABLE PRF_AREA
   ADD CONSTRAINT PRF_AREA_PK PRIMARY KEY (ID_AREA);
   
    ALTER TABLE PRF_AREA ADD CONSTRAINT "PRF_AREA_UQ" UNIQUE ("CODE");
    
    
    
    
   

CREATE TABLE PRF_AREA_FILTER
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_AREA" NUMBER(22,0) NOT NULL,
    "ID_LEVEL" NUMBER(10,0) NOT NULL,
    "ID_FILTER" NUMBER(22,0) NOT NULL,
    "CREATE_TS" TIMESTAMP(6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL) 

    
    
   COMMENT ON COLUMN "PHIMES"."PRF_AREA_FILTER"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_AREA_FILTER"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_AREA_FILTER"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_AREA_FILTER"."MODIFY_UT" IS 'technicians';
   
   CREATE OR REPLACE TRIGGER PRF_AREA_FILTER_CREATE_TS
    BEFORE INSERT ON PRF_AREA_FILTER
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_AREA_FILTER_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_AREA_FILTER_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_AREA_FILTER
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_AREA_FILTER_MODIFY_TS ENABLE;
   
   
   CREATE INDEX PRF_AREA_FILTER_APPLICA_LEVEL ON PRF_AREA_FILTER ("ID_APPLICATION", "ID_LEVEL");
   
   
    
   
   


CREATE TABLE PRF_FILTER
   ("ID_APPLICATION" NUMBER(10,0)NOT NULL,
    "ID_LEVEL" NUMBER(10,0) NOT NULL,
    "ID_FILTER" NUMBER(22,0) NOT NULL, 
	"CODE" VARCHAR2(16) NOT NULL, 
	"DESCRIPTION" VARCHAR2(64) NOT NULL, 
	"LONG_DESCRIPTION" VARCHAR2(256) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL) 
	
 

   COMMENT ON COLUMN "PHIMES"."PRF_FILTER"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_FILTER"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_FILTER"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_FILTER"."MODIFY_UT" IS 'technicians';
 
   
   CREATE SEQUENCE PRF_FILTER_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

  CREATE OR REPLACE TRIGGER PRF_FILTER_TRG
  BEFORE INSERT ON PRF_FILTER
  FOR EACH ROW
BEGIN
  :NEW.ID_FILTER := PRF_FILTER_seq.nextval;
END;
/
ALTER TRIGGER PRF_FILTER_TRG ENABLE;



   CREATE OR REPLACE TRIGGER PRF_FILTER_CREATE_TS
    BEFORE INSERT ON PRF_FILTER
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_FILTER_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_FILTER_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_FILTER
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_FILTER_MODIFY_TS ENABLE;


ALTER TABLE PRF_FILTER
   ADD CONSTRAINT PRF_FILTER_PK PRIMARY KEY (ID_FILTER);
   
   ALTER TABLE PRF_FILTER ADD CONSTRAINT "PRF_FILTER_UQ" UNIQUE ("CODE");
   
   
   
   
     
    
    
CREATE TABLE PRF_FUNCTION
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_FUNCTION" NUMBER(22,0) NOT NULL, 
	"CODE" VARCHAR2(16) NOT NULL, 
	"DESCRIPTION" VARCHAR2(64) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL)

 

   COMMENT ON COLUMN "PHIMES"."PRF_FUNCTION"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_FUNCTION"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_FUNCTION"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_FUNCTION"."MODIFY_UT" IS 'technicians';
   
   
   CREATE SEQUENCE PRF_FUNCTION_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

  CREATE OR REPLACE TRIGGER PRF_FUNCTION_TRG
  BEFORE INSERT ON PRF_FUNCTION
  FOR EACH ROW
BEGIN
  :NEW.ID_FUNCTION := PRF_FUNCTION_seq.nextval;
END;
/
ALTER TRIGGER PRF_FUNCTION_TRG ENABLE;

    CREATE OR REPLACE TRIGGER PRF_FUNCTION_CREATE_TS
    BEFORE INSERT ON PRF_FUNCTION
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_FUNCTION_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_FUNCTION_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_FUNCTION
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_FUNCTION_MODIFY_TS ENABLE;


ALTER TABLE PRF_FUNCTION
   ADD CONSTRAINT PRF_FUNCTION_PK PRIMARY KEY (ID_FUNCTION);
   
   ALTER TABLE PRF_FUNCTION ADD CONSTRAINT "PRF_FUNCTION_UQ" UNIQUE ("CODE");
   
   
    

   
    
CREATE TABLE PRF_LEVEL
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_LEVEL" NUMBER(10,0) NOT NULL, 
	"CODE" VARCHAR2(16) NOT NULL, 
	"DESCRIPTION" VARCHAR2(64) NOT NULL, 
	"LEVEL_ORDER" NUMBER(5,0) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL)
	
 

   COMMENT ON COLUMN "PHIMES"."PRF_LEVEL"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_LEVEL"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_LEVEL"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_LEVEL"."MODIFY_UT" IS 'technicians';
   
   
   CREATE SEQUENCE PRF_LEVEL_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

  CREATE OR REPLACE TRIGGER PRF_LEVEL_TRG
  BEFORE INSERT ON PRF_LEVEL
  FOR EACH ROW
BEGIN
  :NEW.ID_LEVEL := PRF_LEVEL_seq.nextval;
END;
/
ALTER TRIGGER PRF_LEVEL_TRG ENABLE;

CREATE OR REPLACE TRIGGER PRF_LEVEL_CREATE_TS
    BEFORE INSERT ON PRF_LEVEL
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_LEVEL_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_LEVEL_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_LEVEL
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_LEVEL_MODIFY_TS ENABLE;


ALTER TABLE PRF_LEVEL
   ADD CONSTRAINT PRF_LEVEL_PK PRIMARY KEY (ID_LEVEL);
   
   ALTER TABLE PRF_LEVEL ADD CONSTRAINT "PRF_LEVEL_UQ" UNIQUE ("CODE");
   
   
    
   
    


CREATE TABLE PRF_MENU
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_MENU" NUMBER(22,0) NOT NULL, 
    "ID_SUB_MENU" NUMBER(22,0) NOT NULL,
	"CODE" VARCHAR2(16) NOT NULL, 
	"DESCRIPTION" VARCHAR2(64) NOT NULL, 
	"URL" VARCHAR2(256) NOT NULL, 
	"MENU_ORDER" NUMBER(5,0) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL)
	 
 

   COMMENT ON COLUMN "PHIMES"."PRF_MENU"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_MENU"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_MENU"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_MENU"."MODIFY_UT" IS 'technicians';
   
   CREATE SEQUENCE PRF_MENU_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

  CREATE OR REPLACE TRIGGER PRF_MENU_TRG
  BEFORE INSERT ON PRF_MENU
  FOR EACH ROW
BEGIN
  :NEW.ID_MENU := PRF_MENU_seq.nextval;
END;
/
ALTER TRIGGER PRF_MENU_TRG ENABLE;


CREATE OR REPLACE TRIGGER PRF_MENU_CREATE_TS
    BEFORE INSERT ON PRF_MENU
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_MENU_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_MENU_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_MENU
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_MENU_MODIFY_TS ENABLE;


ALTER TABLE PRF_MENU
   ADD CONSTRAINT PRF_MENU_PK PRIMARY KEY (ID_MENU);
   
   CREATE INDEX PRF_MENU_UQ ON PRF_MENU ("ID_APPLICATION", "ID_SUB_MENU");
   
   ALTER TABLE PRF_MENU ADD CONSTRAINT PRF_MENU_ORDER_UK UNIQUE ("MENU_ORDER");
   
   
    

   
    

CREATE TABLE PRF_PARAMETER
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_PARAMETER" VARCHAR2(128) NOT NULL, 
	"VALUE" VARCHAR2(256) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL) 
	
 

   COMMENT ON COLUMN "PHIMES"."PRF_PARAMETER"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_PARAMETER"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_PARAMETER"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_PARAMETER"."MODIFY_UT" IS 'technicians';
   
   
   CREATE OR REPLACE TRIGGER PRF_PARAMETER_CREATE_TS
    BEFORE INSERT ON PRF_PARAMETER
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_PARAMETER_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_PARAMETER_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_PARAMETER
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_PARAMETER_MODIFY_TS ENABLE;
   
   
   ALTER TABLE PRF_PARAMETER
   ADD CONSTRAINT PRF_PARAMETER_PK PRIMARY KEY (ID_PARAMETER);
   
   
    

    
   

CREATE TABLE PRF_ROLE
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_ROLE" NUMBER(22,0) NOT NULL, 
    "ID_STATE" CHAR(1) NOT NULL,
	"CODE" VARCHAR2(16) NOT NULL, 
	"DESCRIPTION" VARCHAR2(64 BYTE) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL) 
	
 

   COMMENT ON COLUMN "PHIMES"."PRF_ROLE"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_ROLE"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_ROLE"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_ROLE"."MODIFY_UT" IS 'technicians';
   
   CREATE SEQUENCE PRF_ROLE_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

  CREATE OR REPLACE TRIGGER PRF_ROLE_TRG
  BEFORE INSERT ON PRF_ROLE
  FOR EACH ROW
BEGIN
  :NEW.ID_ROLE := PRF_ROLE_seq.nextval;
END;
/
ALTER TRIGGER PRF_ROLE_TRG ENABLE;

CREATE OR REPLACE TRIGGER PRF_ROLE_CREATE_TS
    BEFORE INSERT ON PRF_ROLE
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_ROLE_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_ROLE_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_ROLE
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_ROLE_MODIFY_TS ENABLE;


ALTER TABLE PRF_ROLE
   ADD CONSTRAINT PRF_ROLE_PK PRIMARY KEY (ID_ROLE);
   
   ALTER TABLE PRF_ROLE ADD CONSTRAINT "PRF_ROLE_UQ" UNIQUE ("CODE");
   
   
  
   



CREATE TABLE PRF_ROLE_FUNCTION
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_ROLE" NUMBER(22,0) NOT NULL,
    "ID_FUNCTION" NUMBER(22,0) NOT NULL,
    "ID_ACCESS" CHAR(1) NOT NULL,
    "CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL)
 

   COMMENT ON COLUMN "PHIMES"."PRF_ROLE_FUNCTION"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_ROLE_FUNCTION"."CREATE_UT" IS 'technicians';
   
   
   CREATE OR REPLACE TRIGGER PRF_ROLE_FUNCTION_CREATE_TS
    BEFORE INSERT ON PRF_ROLE_FUNCTION
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_ROLE_FUNCTION_CREATE_TS ENABLE;
 
   CREATE INDEX PRF_ROLE_FUNCTION_UQ ON PRF_ROLE_FUNCTION ("ID_APPLICATION", "ID_ROLE", "ID_FUNCTION", "ID_ACCESS");
   
   
    

   
   
   
CREATE TABLE PRF_ROLE_MENU
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_ROLE" NUMBER(22,0) NOT NULL,
    "ID_MENU" NUMBER(22,0) NOT NULL,
    "CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL)
  
 

   COMMENT ON COLUMN "PHIMES"."PRF_ROLE_MENU"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_ROLE_MENU"."CREATE_UT" IS 'technicians';
   
   CREATE OR REPLACE TRIGGER PRF_ROLE_MENU_CREATE_TS
    BEFORE INSERT ON PRF_ROLE_MENU
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_ROLE_MENU_CREATE_TS ENABLE;
   
   
   CREATE INDEX PRF_ROLE_MENU_UQ ON PRF_ROLE_MENU ("ID_APPLICATION", "ID_MENU");
   
   

   
   
   
   
CREATE TABLE PRF_STATE
   ("ID_STATE" CHAR(1) NOT NULL, 
	"DESCRIPTION" VARCHAR2(64) NOT NULL, 
	"STATE_ORDER" NUMBER(5,0) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL) 
	 
 

   COMMENT ON COLUMN "PHIMES"."PRF_STATE"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_STATE"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_STATE"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_STATE"."MODIFY_UT" IS 'technicians';
   
   CREATE OR REPLACE TRIGGER PRF_STATE_CREATE_TS
    BEFORE INSERT ON PRF_STATE
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_STATE_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_STATE_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_STATE
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_STATE_MODIFY_TS ENABLE;
   
   
   ALTER TABLE PRF_STATE
   ADD CONSTRAINT PRF_STATE_PK PRIMARY KEY (ID_STATE);
   
   ALTER TABLE PRF_STATE ADD CONSTRAINT "PRF_STATE_UQ" UNIQUE ("DESCRIPTION", "STATE_ORDER");
   
   
    




CREATE TABLE PRF_USER
   ("ID_USER" NUMBER(22,0) NOT NULL,
    "ID_STATE" CHAR(1) NOT NULL,
	"USERNAME" VARCHAR2(16) NOT NULL, 
	"DOMAIN_CODE" VARCHAR2(16) NOT NULL, 
	"CREATE_TS" TIMESTAMP (6) NOT NULL ENABLE, 
	"CREATE_UT" VARCHAR2(16) NOT NULL, 
	"MODIFY_TS" TIMESTAMP (6) NOT NULL, 
	"MODIFY_UT" VARCHAR2(16) NOT NULL)
	
 

   COMMENT ON COLUMN "PHIMES"."PRF_USER"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_USER"."CREATE_UT" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_USER"."MODIFY_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_USER"."MODIFY_UT" IS 'technicians';  
   
   
   CREATE SEQUENCE PRF_USER_seq
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;
 

  CREATE OR REPLACE TRIGGER PRF_USER_TRG
  BEFORE INSERT ON PRF_USER
  FOR EACH ROW
BEGIN
  :NEW.ID_USER := PRF_USER_seq.nextval;
END;
/
ALTER TRIGGER PRF_USER_TRG ENABLE;


CREATE OR REPLACE TRIGGER PRF_USER_CREATE_TS
    BEFORE INSERT ON PRF_USER
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_USER_CREATE_TS ENABLE;


    CREATE OR REPLACE TRIGGER PRF_USER_MODIFY_TS
    BEFORE INSERT OR UPDATE ON PRF_USER
    FOR EACH ROW
BEGIN
  :NEW.MODIFY_TS := SYSDATE;
END;
/
 ALTER TRIGGER PRF_USER_MODIFY_TS ENABLE;


ALTER TABLE PRF_USER
   ADD CONSTRAINT PRF_USER_PK PRIMARY KEY (ID_USER);
   
   ALTER TABLE PRF_USER ADD CONSTRAINT "PRF_USER_UQ" UNIQUE ("USERNAME");
   

   




CREATE TABLE PRF_USER_AREA
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_USER" NUMBER(22,0) NOT NULL,
    "ID_AREA" NUMBER(22,0) NOT NULL,
    "CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL)
  
 

   COMMENT ON COLUMN "PHIMES"."PRF_USER_AREA"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_USER_AREA"."CREATE_UT" IS 'technicians';
   
   CREATE OR REPLACE TRIGGER PRF_USER_AREA_CREATE_TS
    BEFORE INSERT ON PRF_USER_AREA
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_USER_AREA_CREATE_TS ENABLE;

   
   CREATE INDEX PRF_USER_AREA_UQ ON PRF_USER_AREA ("ID_APPLICATION", "ID_AREA");
   
   
   

   


CREATE TABLE PRF_USER_ROLE
   ("ID_APPLICATION" NUMBER(10,0) NOT NULL,
    "ID_USER" NUMBER(22,0) NOT NULL,
    "ID_ROLE" NUMBER(22,0),
    "CREATE_TS" TIMESTAMP (6) NOT NULL, 
	"CREATE_UT" VARCHAR2(16) NOT NULL) 
 

   COMMENT ON COLUMN "PHIMES"."PRF_USER_ROLE"."CREATE_TS" IS 'technicians';
   COMMENT ON COLUMN "PHIMES"."PRF_USER_ROLE"."CREATE_UT" IS 'technicians';
   
   CREATE OR REPLACE TRIGGER PRF_USER_ROLE_CREATE_TS
    BEFORE INSERT ON PRF_USER_ROLE
    FOR EACH ROW
BEGIN
  :NEW.CREATE_TS := SYSDATE;
END;
/
ALTER TRIGGER PRF_USER_ROLE_CREATE_TS ENABLE;
   
   CREATE INDEX PRF_USER_ROLE_UQ ON PRF_USER_ROLE ("ID_APPLICATION", "ID_ROLE");
   
    
    
    
    
    
    INSERT INTO PRF_ACCESS
    (ID_ACCESS, DESCRIPTION, ACCESS_ORDER, CREATE_UT, MODIFY_UT)
    VALUES
    ('a', 'acc_description_test', '1', 'admin', 'admin');
    
    
    INSERT INTO PRF_APPLICATION
    (ID_STATE, CODE, DESCRIPTION, DOMAIN_CODE, PROFILING_DATES, JUMP_PROFILING, CREATE_UT, MODIFY_UT)
    VALUES
    ('c', 'app_code_test', 'app_description_test', 'dom_code_test', 'Y', 'N', 'admin', 'admin');
    
    
    INSERT INTO PRF_AREA
    (ID_APPLICATION, ID_STATE, CODE, DESCRIPTION, CREATE_UT, MODIFY_UT)
    VALUES
    ('1', 'c', 'ar_code_test', 'ar_description_test', 'admin', 'admin');
    
    
    INSERT INTO PRF_AREA_FILTER
    (ID_APPLICATION, ID_AREA, ID_LEVEL, ID_FILTER, CREATE_UT, MODIFY_UT)
    VALUES
    ('1', '1', '1', '1', 'admin', 'admin');
    
    
    INSERT INTO PRF_FILTER
    (ID_APPLICATION, ID_LEVEL, CODE, DESCRIPTION, LONG_DESCRIPTION, CREATE_UT, MODIFY_UT)
    VALUES
    ('1', '1', 'fil_code_test', 'fil_description_test', 'fil_long_description_test', 'admin', 'admin');
    
    
    INSERT INTO PRF_FUNCTION
    (ID_APPLICATION, CODE, DESCRIPTION, CREATE_UT, MODIFY_UT)
    VALUES
    ('1', 'fun_code_test', 'fun_description_test', 'admin', 'admin');
    
    
    INSERT INTO PRF_LEVEL
    (ID_APPLICATION, CODE, DESCRIPTION, LEVEL_ORDER, CREATE_UT, MODIFY_UT)
    VALUES
    ('1', 'lev_code_test', 'lev_description_test', '2', 'admin', 'admin');
    
    
    INSERT INTO PRF_MENU
    (ID_APPLICATION, ID_SUB_MENU, CODE, DESCRIPTION, URL, MENU_ORDER, CREATE_UT, MODIFY_UT)
    VALUES
    ('1', '1', 'mn_code_test', 'mn_description_test', 'url_test', '3', 'admin', 'admin');
    
    
    INSERT INTO PRF_PARAMETER
    (ID_APPLICATION, ID_PARAMETER, VALUE, CREATE_UT, MODIFY_UT)
    VALUES
    ('1', 'd', 'par_value_test', 'admin', 'admin');
    
    
     INSERT INTO PRF_ROLE
    (ID_APPLICATION, ID_STATE, CODE, DESCRIPTION, CREATE_UT, MODIFY_UT)
    VALUES
    ('1', 'c', 'rl_code_test', 'rl_description_test', 'admin', 'admin');
    
    
    INSERT INTO PRF_ROLE_FUNCTION
    (ID_APPLICATION, ID_ROLE, ID_FUNCTION, ID_ACCESS, CREATE_UT)
    VALUES
    ('1', '1', '1', 'a', 'admin');
    
    
     INSERT INTO PRF_ROLE_MENU
    (ID_APPLICATION, ID_ROLE, ID_MENU, CREATE_UT)
    VALUES
    ('1', '1', '1', 'admin'); 
    
    
    INSERT INTO PRF_STATE
    (ID_STATE, DESCRIPTION, STATE_ORDER, CREATE_UT, MODIFY_UT)
    VALUES
    ('c', 'st_description_test', '4', 'admin', 'admin');
    
    
    INSERT INTO PRF_USER
    (ID_STATE, USERNAME, DOMAIN_CODE, CREATE_UT, MODIFY_UT)
    VALUES
    ('c', 'us_username_test', 'us_dom_code', 'admin', 'admin');
    
    
    INSERT INTO PRF_USER_AREA
    (ID_APPLICATION, ID_USER, ID_AREA, CREATE_UT)
    VALUES
    ('1', '1', '1', 'admin');
    
    
     INSERT INTO PRF_USER_ROLE
    (ID_APPLICATION, ID_USER, ID_ROLE, CREATE_UT)
    VALUES
    ('1', '1', '1', 'admin');
    
    
    

    
   ALTER TABLE PRF_APPLICATION
    ADD CONSTRAINT FK_PRF_APPLICATION
    FOREIGN KEY (ID_STATE)
    REFERENCES PRF_STATE(ID_STATE);
    
     ALTER TABLE PRF_AREA
    ADD CONSTRAINT FK_PRF_AREA_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_AREA
    ADD CONSTRAINT FK_PRF_AREA_STA
    FOREIGN KEY (ID_STATE)
    REFERENCES PRF_STATE(ID_STATE);
    
    ALTER TABLE PRF_AREA_FILTER
    ADD CONSTRAINT FK_PRF_AREA_FILTER_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_AREA_FILTER
    ADD CONSTRAINT FK_PRF_AREA_FILTER_AREA
    FOREIGN KEY (ID_AREA)
    REFERENCES PRF_AREA(ID_AREA);
    
    ALTER TABLE PRF_AREA_FILTER
    ADD CONSTRAINT FK_PRF_ARIA_FILTER_LEV
    FOREIGN KEY (ID_LEVEL)
    REFERENCES PRF_LEVEL(ID_LEVEL);
    
    ALTER TABLE PRF_AREA_FILTER
    ADD CONSTRAINT FK_PRF_AREA_FILTER_FIL
    FOREIGN KEY (ID_FILTER)
    REFERENCES PRF_FILTER(ID_FILTER);
    
    ALTER TABLE PRF_FILTER
    ADD CONSTRAINT FK_PRF_FILTER_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_FILTER
    ADD CONSTRAINT FK_PRF_FILTER_LEV
    FOREIGN KEY (ID_LEVEL)
    REFERENCES PRF_LEVEL(ID_LEVEL);
    
    ALTER TABLE PRF_FUNCTION
    ADD CONSTRAINT FK_PRF_FUNCTION_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_LEVEL
    ADD CONSTRAINT FK_PRF_LEVEL_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION (ID_APPLICATION);
    
    ALTER TABLE PRF_MENU
    ADD CONSTRAINT FK_PRF_MENU_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
     ALTER TABLE PRF_MENU
     ADD CONSTRAINT FK_PRF_SUPER_MENU
     FOREIGN KEY (ID_SUB_MENU)
     REFERENCES PRF_MENU(ID_MENU);
     
    ALTER TABLE PRF_PARAMETER
    ADD CONSTRAINT FK_PRF_PARAMETER_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_ROLE
    ADD CONSTRAINT FK_PRF_ROLE_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_ROLE
    ADD CONSTRAINT FK_PRF_ROLE_STA
    FOREIGN KEY (ID_STATE)
    REFERENCES PRF_STATE(ID_STATE);
    
    ALTER TABLE PRF_ROLE_FUNCTION
    ADD CONSTRAINT FK_PRF_ROLE_FUNCTION_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_ROLE_FUNCTION
    ADD CONSTRAINT FK_PRF_ROLE_FUNCTION_ROLE
    FOREIGN KEY (ID_ROLE)
    REFERENCES PRF_ROLE(ID_ROLE);
    
    ALTER TABLE PRF_ROLE_FUNCTION
    ADD CONSTRAINT FK_PRF_ROLE_FUNCTION_FUN
    FOREIGN KEY (ID_FUNCTION)
    REFERENCES PRF_FUNCTION(ID_FUNCTION);
    
    ALTER TABLE PRF_ROLE_FUNCTION
    ADD CONSTRAINT FK_PRF_ROLE_FUNCTION_ACC
    FOREIGN KEY (ID_ACCESS)
    REFERENCES PRF_ACCESS(ID_ACCESS);
    
    ALTER TABLE PRF_ROLE_MENU
    ADD CONSTRAINT FK_PRF_ROLE_MENU_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_ROLE_MENU
    ADD CONSTRAINT FK_PRF_ROLE_MENU_ROLE
    FOREIGN KEY (ID_ROLE)
    REFERENCES PRF_ROLE(ID_ROLE);
    
    ALTER TABLE PRF_ROLE_MENU
    ADD CONSTRAINT FK_PRF_ROLE_MENU_MENU
    FOREIGN KEY (ID_MENU)
    REFERENCES PRF_MENU(ID_MENU);
    
    ALTER TABLE PRF_USER
    ADD CONSTRAINT FK_PRF_USER_STA
    FOREIGN KEY (ID_STATE)
    REFERENCES PRF_STATE(ID_STATE);
    
    ALTER TABLE PRF_USER_AREA
    ADD CONSTRAINT FK_PRF_USER_AREA_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_USER_AREA
    ADD CONSTRAINT FK_PRF_USER_AREA_USER
    FOREIGN KEY (ID_USER)
    REFERENCES PRF_USER(ID_USER);
    
    ALTER TABLE PRF_USER_AREA
    ADD CONSTRAINT FK_PRF_USER_AREA_AREA
    FOREIGN KEY (ID_AREA)
    REFERENCES PRF_AREA(ID_AREA);
   
    ALTER TABLE PRF_USER_ROLE
    ADD CONSTRAINT FK_PRF_USER_ROLE_APP
    FOREIGN KEY (ID_APPLICATION)
    REFERENCES PRF_APPLICATION(ID_APPLICATION);
    
    ALTER TABLE PRF_USER_ROLE
    ADD CONSTRAINT FK_PRF_USER_ROLE_USER
    FOREIGN KEY (ID_USER)
    REFERENCES PRF_USER(ID_USER);
    
    ALTER TABLE PRF_USER_ROLE
    ADD CONSTRAINT FK_PRF_USER_ROLE_ROLE
    FOREIGN KEY (ID_ROLE)
    REFERENCES PRF_ROLE(ID_ROLE);