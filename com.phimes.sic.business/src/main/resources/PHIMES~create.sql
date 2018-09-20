CREATE TABLE prf_access (
    "ID_ACCESS"      CHAR(1) NOT NULL,
    "DESCRIPTION"    VARCHAR2(64) NOT NULL,
    "ACCESS_ORDER"   NUMBER(5,0) NOT NULL,
    "CREATE_TS"      TIMESTAMP(6) NOT NULL,
    "CREATE_UT"      VARCHAR2(16) NOT NULL,
    "MODIFY_TS"      TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"      VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_ACCESS"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_ACCESS"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_ACCESS"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_ACCESS"."MODIFY_UT" IS
    'technicians';

CREATE OR REPLACE TRIGGER prf_access_create_ts BEFORE
    INSERT ON prf_access
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_access_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_access_modify_ts BEFORE
    INSERT OR UPDATE ON prf_access
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_access_modify_ts ENABLE;

ALTER TABLE prf_access ADD CONSTRAINT prf_access_pk PRIMARY KEY ( id_access );

ALTER TABLE prf_access ADD CONSTRAINT "PRF_ACCESS_UQ" UNIQUE ( "DESCRIPTION",
                                                               "ACCESS_ORDER" );

CREATE TABLE prf_application (
    "ID_APPLICATION"    NUMBER(10,0) NOT NULL,
    "ID_STATE"          CHAR(1) NOT NULL,
    "CODE"              VARCHAR2(16) NOT NULL,
    "DESCRIPTION"       VARCHAR2(64) NOT NULL,
    "DOMAIN_CODE"       VARCHAR2(16) NOT NULL,
    "PROFILING_DATES"   CHAR(1) NOT NULL,
    "JUMP_PROFILING"    CHAR(1) NOT NULL,
    "CREATE_TS"         TIMESTAMP(6) NOT NULL,
    "CREATE_UT"         VARCHAR2(16) NOT NULL,
    "MODIFY_TS"         TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"         VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_APPLICATION"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_APPLICATION"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_APPLICATION"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_APPLICATION"."MODIFY_UT" IS
    'technicians';

CREATE SEQUENCE prf_application_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER prf_application_trg BEFORE
    INSERT ON prf_application
    FOR EACH ROW
BEGIN
    :new.id_application := prf_application_seq.nextval;
END;
/

ALTER TRIGGER prf_application_trg ENABLE;

CREATE OR REPLACE TRIGGER prf_application_create_ts BEFORE
    INSERT ON prf_application
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_application_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_application_modify_ts BEFORE
    INSERT OR UPDATE ON prf_application
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_application_modify_ts ENABLE;

ALTER TABLE prf_application ADD CONSTRAINT prf_application_pk PRIMARY KEY ( id_application );

ALTER TABLE prf_application ADD CONSTRAINT "PRF_APPLICATION_UQ" UNIQUE ( "CODE" );

ALTER TABLE prf_application
    ADD CONSTRAINT prf_ck_app_profiling_dates CHECK ( profiling_dates IN (
        'Y',
        'N'
    ) );

ALTER TABLE prf_application
    ADD CONSTRAINT prf_ck_app_jump_profiling CHECK ( jump_profiling IN (
        'Y',
        'N'
    ) );

CREATE TABLE prf_area (
    "ID_AREA"          NUMBER(22,0) NOT NULL,
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_STATE"         CHAR(1) NOT NULL,
    "CODE"             VARCHAR2(16) NOT NULL,
    "DESCRIPTION"      VARCHAR2(64) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL,
    "MODIFY_TS"        TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_AREA"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_AREA"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_AREA"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_AREA"."MODIFY_UT" IS
    'technicians';

CREATE SEQUENCE prf_area_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER prf_area_trg BEFORE
    INSERT ON prf_area
    FOR EACH ROW
BEGIN
    :new.id_area := prf_area_seq.nextval;
END;
/

ALTER TRIGGER prf_area_trg ENABLE;

CREATE OR REPLACE TRIGGER prf_area_create_ts BEFORE
    INSERT ON prf_area
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_area_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_area_modify_ts BEFORE
    INSERT OR UPDATE ON prf_area
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_area_modify_ts ENABLE;

ALTER TABLE prf_area ADD CONSTRAINT prf_area_pk PRIMARY KEY ( id_area );

ALTER TABLE prf_area ADD CONSTRAINT "PRF_AREA_UQ" UNIQUE ( "CODE" );

CREATE TABLE prf_area_filter (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_AREA"          NUMBER(22,0) NOT NULL,
    "ID_LEVEL"         NUMBER(10,0) NOT NULL,
    "ID_FILTER"        NUMBER(22,0) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL,
    "MODIFY_TS"        TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_AREA_FILTER"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_AREA_FILTER"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_AREA_FILTER"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_AREA_FILTER"."MODIFY_UT" IS
    'technicians';

CREATE OR REPLACE TRIGGER prf_area_filter_create_ts BEFORE
    INSERT ON prf_area_filter
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_area_filter_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_area_filter_modify_ts BEFORE
    INSERT OR UPDATE ON prf_area_filter
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_area_filter_modify_ts ENABLE;

CREATE INDEX prf_area_filter_applica_level ON
    prf_area_filter (
        "ID_APPLICATION",
        "ID_LEVEL"
    );

CREATE TABLE prf_filter (
    "ID_APPLICATION"     NUMBER(10,0) NOT NULL,
    "ID_LEVEL"           NUMBER(10,0) NOT NULL,
    "ID_FILTER"          NUMBER(22,0) NOT NULL,
    "CODE"               VARCHAR2(16) NOT NULL,
    "DESCRIPTION"        VARCHAR2(64) NOT NULL,
    "LONG_DESCRIPTION"   VARCHAR2(256) NOT NULL,
    "CREATE_TS"          TIMESTAMP(6) NOT NULL,
    "CREATE_UT"          VARCHAR2(16) NOT NULL,
    "MODIFY_TS"          TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"          VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_FILTER"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_FILTER"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_FILTER"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_FILTER"."MODIFY_UT" IS
    'technicians';

CREATE SEQUENCE prf_filter_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER prf_filter_trg BEFORE
    INSERT ON prf_filter
    FOR EACH ROW
BEGIN
    :new.id_filter := prf_filter_seq.nextval;
END;
/

ALTER TRIGGER prf_filter_trg ENABLE;

CREATE OR REPLACE TRIGGER prf_filter_create_ts BEFORE
    INSERT ON prf_filter
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_filter_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_filter_modify_ts BEFORE
    INSERT OR UPDATE ON prf_filter
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_filter_modify_ts ENABLE;

ALTER TABLE prf_filter ADD CONSTRAINT prf_filter_pk PRIMARY KEY ( id_filter );

ALTER TABLE prf_filter ADD CONSTRAINT "PRF_FILTER_UQ" UNIQUE ( "CODE" );

CREATE TABLE prf_function (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_FUNCTION"      NUMBER(22,0) NOT NULL,
    "CODE"             VARCHAR2(16) NOT NULL,
    "DESCRIPTION"      VARCHAR2(64) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL,
    "MODIFY_TS"        TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_FUNCTION"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_FUNCTION"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_FUNCTION"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_FUNCTION"."MODIFY_UT" IS
    'technicians';

CREATE SEQUENCE prf_function_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER prf_function_trg BEFORE
    INSERT ON prf_function
    FOR EACH ROW
BEGIN
    :new.id_function := prf_function_seq.nextval;
END;
/

ALTER TRIGGER prf_function_trg ENABLE;

CREATE OR REPLACE TRIGGER prf_function_create_ts BEFORE
    INSERT ON prf_function
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_function_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_function_modify_ts BEFORE
    INSERT OR UPDATE ON prf_function
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_function_modify_ts ENABLE;

ALTER TABLE prf_function ADD CONSTRAINT prf_function_pk PRIMARY KEY ( id_function );

ALTER TABLE prf_function ADD CONSTRAINT "PRF_FUNCTION_UQ" UNIQUE ( "CODE" );

CREATE TABLE prf_level (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_LEVEL"         NUMBER(10,0) NOT NULL,
    "CODE"             VARCHAR2(16) NOT NULL,
    "DESCRIPTION"      VARCHAR2(64) NOT NULL,
    "LEVEL_ORDER"      NUMBER(5,0) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL,
    "MODIFY_TS"        TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_LEVEL"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_LEVEL"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_LEVEL"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_LEVEL"."MODIFY_UT" IS
    'technicians';

CREATE SEQUENCE prf_level_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER prf_level_trg BEFORE
    INSERT ON prf_level
    FOR EACH ROW
BEGIN
    :new.id_level := prf_level_seq.nextval;
END;
/

ALTER TRIGGER prf_level_trg ENABLE;

CREATE OR REPLACE TRIGGER prf_level_create_ts BEFORE
    INSERT ON prf_level
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_level_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_level_modify_ts BEFORE
    INSERT OR UPDATE ON prf_level
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_level_modify_ts ENABLE;

ALTER TABLE prf_level ADD CONSTRAINT prf_level_pk PRIMARY KEY ( id_level );

ALTER TABLE prf_level ADD CONSTRAINT "PRF_LEVEL_UQ" UNIQUE ( "CODE" );

CREATE TABLE prf_menu (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_MENU"          NUMBER(22,0) NOT NULL,
    "ID_SUB_MENU"      NUMBER(22,0) NOT NULL,
    "CODE"             VARCHAR2(16) NOT NULL,
    "DESCRIPTION"      VARCHAR2(64) NOT NULL,
    "URL"              VARCHAR2(256) NOT NULL,
    "MENU_ORDER"       NUMBER(5,0) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL,
    "MODIFY_TS"        TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_MENU"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_MENU"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_MENU"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_MENU"."MODIFY_UT" IS
    'technicians';

CREATE SEQUENCE prf_menu_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER prf_menu_trg BEFORE
    INSERT ON prf_menu
    FOR EACH ROW
BEGIN
    :new.id_menu := prf_menu_seq.nextval;
END;
/

ALTER TRIGGER prf_menu_trg ENABLE;

CREATE OR REPLACE TRIGGER prf_menu_create_ts BEFORE
    INSERT ON prf_menu
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_menu_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_menu_modify_ts BEFORE
    INSERT OR UPDATE ON prf_menu
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_menu_modify_ts ENABLE;

ALTER TABLE prf_menu ADD CONSTRAINT prf_menu_pk PRIMARY KEY ( id_menu );

CREATE INDEX prf_menu_uq ON
    prf_menu (
        "ID_APPLICATION",
        "ID_SUB_MENU"
    );

ALTER TABLE prf_menu ADD CONSTRAINT prf_menu_order_uk UNIQUE ( "MENU_ORDER" );

CREATE TABLE prf_parameter (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_PARAMETER"     VARCHAR2(128) NOT NULL,
    "VALUE"            VARCHAR2(256) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL,
    "MODIFY_TS"        TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_PARAMETER"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_PARAMETER"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_PARAMETER"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_PARAMETER"."MODIFY_UT" IS
    'technicians';

CREATE OR REPLACE TRIGGER prf_parameter_create_ts BEFORE
    INSERT ON prf_parameter
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_parameter_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_parameter_modify_ts BEFORE
    INSERT OR UPDATE ON prf_parameter
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_parameter_modify_ts ENABLE;

ALTER TABLE prf_parameter ADD CONSTRAINT prf_parameter_pk PRIMARY KEY ( id_parameter );

CREATE TABLE prf_role (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_ROLE"          NUMBER(22,0) NOT NULL,
    "ID_STATE"         CHAR(1) NOT NULL,
    "CODE"             VARCHAR2(16) NOT NULL,
    "DESCRIPTION"      VARCHAR2(64 BYTE) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL,
    "MODIFY_TS"        TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_ROLE"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_ROLE"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_ROLE"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_ROLE"."MODIFY_UT" IS
    'technicians';

CREATE SEQUENCE prf_role_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER prf_role_trg BEFORE
    INSERT ON prf_role
    FOR EACH ROW
BEGIN
    :new.id_role := prf_role_seq.nextval;
END;
/

ALTER TRIGGER prf_role_trg ENABLE;

CREATE OR REPLACE TRIGGER prf_role_create_ts BEFORE
    INSERT ON prf_role
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_role_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_role_modify_ts BEFORE
    INSERT OR UPDATE ON prf_role
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_role_modify_ts ENABLE;

ALTER TABLE prf_role ADD CONSTRAINT prf_role_pk PRIMARY KEY ( id_role );

ALTER TABLE prf_role ADD CONSTRAINT "PRF_ROLE_UQ" UNIQUE ( "CODE" );

CREATE TABLE prf_role_function (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_ROLE"          NUMBER(22,0) NOT NULL,
    "ID_FUNCTION"      NUMBER(22,0) NOT NULL,
    "ID_ACCESS"        CHAR(1) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_ROLE_FUNCTION"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_ROLE_FUNCTION"."CREATE_UT" IS
    'technicians';

CREATE OR REPLACE TRIGGER prf_role_function_create_ts BEFORE
    INSERT ON prf_role_function
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_role_function_create_ts ENABLE;

CREATE INDEX prf_role_function_uq ON
    prf_role_function (
        "ID_APPLICATION",
        "ID_ROLE",
        "ID_FUNCTION",
        "ID_ACCESS"
    );

CREATE TABLE prf_role_menu (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_ROLE"          NUMBER(22,0) NOT NULL,
    "ID_MENU"          NUMBER(22,0) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_ROLE_MENU"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_ROLE_MENU"."CREATE_UT" IS
    'technicians';

CREATE OR REPLACE TRIGGER prf_role_menu_create_ts BEFORE
    INSERT ON prf_role_menu
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_role_menu_create_ts ENABLE;

CREATE INDEX prf_role_menu_uq ON
    prf_role_menu (
        "ID_APPLICATION",
        "ID_MENU"
    );

CREATE TABLE prf_state (
    "ID_STATE"      CHAR(1) NOT NULL,
    "DESCRIPTION"   VARCHAR2(64) NOT NULL,
    "STATE_ORDER"   NUMBER(5,0) NOT NULL,
    "CREATE_TS"     TIMESTAMP(6) NOT NULL,
    "CREATE_UT"     VARCHAR2(16) NOT NULL,
    "MODIFY_TS"     TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"     VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_STATE"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_STATE"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_STATE"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_STATE"."MODIFY_UT" IS
    'technicians';

CREATE OR REPLACE TRIGGER prf_state_create_ts BEFORE
    INSERT ON prf_state
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_state_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_state_modify_ts BEFORE
    INSERT OR UPDATE ON prf_state
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_state_modify_ts ENABLE;

ALTER TABLE prf_state ADD CONSTRAINT prf_state_pk PRIMARY KEY ( id_state );

ALTER TABLE prf_state ADD CONSTRAINT "PRF_STATE_UQ" UNIQUE ( "DESCRIPTION",
                                                             "STATE_ORDER" );

CREATE TABLE prf_user (
    "ID_USER"       NUMBER(22,0) NOT NULL,
    "ID_STATE"      CHAR(1) NOT NULL,
    "USERNAME"      VARCHAR2(16) NOT NULL,
    "DOMAIN_CODE"   VARCHAR2(16) NOT NULL,
    "CREATE_TS"     TIMESTAMP(6)
        NOT NULL ENABLE,
    "CREATE_UT"     VARCHAR2(16) NOT NULL,
    "MODIFY_TS"     TIMESTAMP(6) NOT NULL,
    "MODIFY_UT"     VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_USER"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_USER"."CREATE_UT" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_USER"."MODIFY_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_USER"."MODIFY_UT" IS
    'technicians';

CREATE SEQUENCE prf_user_seq START WITH 1 INCREMENT BY 1 NOCACHE NOCYCLE;

CREATE OR REPLACE TRIGGER prf_user_trg BEFORE
    INSERT ON prf_user
    FOR EACH ROW
BEGIN
    :new.id_user := prf_user_seq.nextval;
END;
/

ALTER TRIGGER prf_user_trg ENABLE;

CREATE OR REPLACE TRIGGER prf_user_create_ts BEFORE
    INSERT ON prf_user
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_user_create_ts ENABLE;

CREATE OR REPLACE TRIGGER prf_user_modify_ts BEFORE
    INSERT OR UPDATE ON prf_user
    FOR EACH ROW
BEGIN
    :new.modify_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_user_modify_ts ENABLE;

ALTER TABLE prf_user ADD CONSTRAINT prf_user_pk PRIMARY KEY ( id_user );

ALTER TABLE prf_user ADD CONSTRAINT "PRF_USER_UQ" UNIQUE ( "USERNAME" );

CREATE TABLE prf_user_area (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_USER"          NUMBER(22,0) NOT NULL,
    "ID_AREA"          NUMBER(22,0) NOT NULL,
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_USER_AREA"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_USER_AREA"."CREATE_UT" IS
    'technicians';

CREATE OR REPLACE TRIGGER prf_user_area_create_ts BEFORE
    INSERT ON prf_user_area
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_user_area_create_ts ENABLE;

CREATE INDEX prf_user_area_uq ON
    prf_user_area (
        "ID_APPLICATION",
        "ID_AREA"
    );

CREATE TABLE prf_user_role (
    "ID_APPLICATION"   NUMBER(10,0) NOT NULL,
    "ID_USER"          NUMBER(22,0) NOT NULL,
    "ID_ROLE"          NUMBER(22,0),
    "CREATE_TS"        TIMESTAMP(6) NOT NULL,
    "CREATE_UT"        VARCHAR2(16) NOT NULL
);

COMMENT ON COLUMN "PHIMES"."PRF_USER_ROLE"."CREATE_TS" IS
    'technicians';

COMMENT ON COLUMN "PHIMES"."PRF_USER_ROLE"."CREATE_UT" IS
    'technicians';

CREATE OR REPLACE TRIGGER prf_user_role_create_ts BEFORE
    INSERT ON prf_user_role
    FOR EACH ROW
BEGIN
    :new.create_ts := SYSDATE;
END;
/

ALTER TRIGGER prf_user_role_create_ts ENABLE;

CREATE INDEX prf_user_role_uq ON
    prf_user_role (
        "ID_APPLICATION",
        "ID_ROLE"
    );

INSERT INTO prf_access (
    id_access,
    description,
    access_order,
    create_ut,
    modify_ut
) VALUES (
    'a',
    'acc_description_test',
    '1',
    'admin',
    'admin'
);

INSERT INTO prf_application (
    id_state,
    code,
    description,
    domain_code,
    profiling_dates,
    jump_profiling,
    create_ut,
    modify_ut
) VALUES (
    'c',
    'app_code_test',
    'app_description_test',
    'dom_code_test',
    'Y',
    'N',
    'admin',
    'admin'
);

INSERT INTO prf_area (
    id_application,
    id_state,
    code,
    description,
    create_ut,
    modify_ut
) VALUES (
    '1',
    'c',
    'ar_code_test',
    'ar_description_test',
    'admin',
    'admin'
);

INSERT INTO prf_area_filter (
    id_application,
    id_area,
    id_level,
    id_filter,
    create_ut,
    modify_ut
) VALUES (
    '1',
    '1',
    '1',
    '1',
    'admin',
    'admin'
);

INSERT INTO prf_filter (
    id_application,
    id_level,
    code,
    description,
    long_description,
    create_ut,
    modify_ut
) VALUES (
    '1',
    '1',
    'fil_code_test',
    'fil_description_test',
    'fil_long_description_test',
    'admin',
    'admin'
);

INSERT INTO prf_function (
    id_application,
    code,
    description,
    create_ut,
    modify_ut
) VALUES (
    '1',
    'fun_code_test',
    'fun_description_test',
    'admin',
    'admin'
);

INSERT INTO prf_level (
    id_application,
    code,
    description,
    level_order,
    create_ut,
    modify_ut
) VALUES (
    '1',
    'lev_code_test',
    'lev_description_test',
    '2',
    'admin',
    'admin'
);

INSERT INTO prf_menu (
    id_application,
    id_sub_menu,
    code,
    description,
    url,
    menu_order,
    create_ut,
    modify_ut
) VALUES (
    '1',
    '1',
    'mn_code_test',
    'mn_description_test',
    'url_test',
    '3',
    'admin',
    'admin'
);

INSERT INTO prf_parameter (
    id_application,
    id_parameter,
    value,
    create_ut,
    modify_ut
) VALUES (
    '1',
    'd',
    'par_value_test',
    'admin',
    'admin'
);

INSERT INTO prf_role (
    id_application,
    id_state,
    code,
    description,
    create_ut,
    modify_ut
) VALUES (
    '1',
    'c',
    'rl_code_test',
    'rl_description_test',
    'admin',
    'admin'
);

INSERT INTO prf_role_function (
    id_application,
    id_role,
    id_function,
    id_access,
    create_ut
) VALUES (
    '1',
    '1',
    '1',
    'a',
    'admin'
);

INSERT INTO prf_role_menu (
    id_application,
    id_role,
    id_menu,
    create_ut
) VALUES (
    '1',
    '1',
    '1',
    'admin'
);

INSERT INTO prf_state (
    id_state,
    description,
    state_order,
    create_ut,
    modify_ut
) VALUES (
    'c',
    'st_description_test',
    '4',
    'admin',
    'admin'
);

INSERT INTO prf_user (
    id_state,
    username,
    domain_code,
    create_ut,
    modify_ut
) VALUES (
    'c',
    'us_username_test',
    'us_dom_code',
    'admin',
    'admin'
);

INSERT INTO prf_user_area (
    id_application,
    id_user,
    id_area,
    create_ut
) VALUES (
    '1',
    '1',
    '1',
    'admin'
);

INSERT INTO prf_user_role (
    id_application,
    id_user,
    id_role,
    create_ut
) VALUES (
    '1',
    '1',
    '1',
    'admin'
);

ALTER TABLE prf_application
    ADD CONSTRAINT fk_prf_application FOREIGN KEY ( id_state )
        REFERENCES prf_state ( id_state );

ALTER TABLE prf_area
    ADD CONSTRAINT fk_prf_area_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_area
    ADD CONSTRAINT fk_prf_area_sta FOREIGN KEY ( id_state )
        REFERENCES prf_state ( id_state );

ALTER TABLE prf_area_filter
    ADD CONSTRAINT fk_prf_area_filter_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_area_filter
    ADD CONSTRAINT fk_prf_area_filter_area FOREIGN KEY ( id_area )
        REFERENCES prf_area ( id_area );

ALTER TABLE prf_area_filter
    ADD CONSTRAINT fk_prf_aria_filter_lev FOREIGN KEY ( id_level )
        REFERENCES prf_level ( id_level );

ALTER TABLE prf_area_filter
    ADD CONSTRAINT fk_prf_area_filter_fil FOREIGN KEY ( id_filter )
        REFERENCES prf_filter ( id_filter );

ALTER TABLE prf_filter
    ADD CONSTRAINT fk_prf_filter_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_filter
    ADD CONSTRAINT fk_prf_filter_lev FOREIGN KEY ( id_level )
        REFERENCES prf_level ( id_level );

ALTER TABLE prf_function
    ADD CONSTRAINT fk_prf_function_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_level
    ADD CONSTRAINT fk_prf_level_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_menu
    ADD CONSTRAINT fk_prf_menu_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_menu
    ADD CONSTRAINT fk_prf_super_menu FOREIGN KEY ( id_sub_menu )
        REFERENCES prf_menu ( id_menu );

ALTER TABLE prf_parameter
    ADD CONSTRAINT fk_prf_parameter_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_role
    ADD CONSTRAINT fk_prf_role_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_role
    ADD CONSTRAINT fk_prf_role_sta FOREIGN KEY ( id_state )
        REFERENCES prf_state ( id_state );

ALTER TABLE prf_role_function
    ADD CONSTRAINT fk_prf_role_function_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_role_function
    ADD CONSTRAINT fk_prf_role_function_role FOREIGN KEY ( id_role )
        REFERENCES prf_role ( id_role );

ALTER TABLE prf_role_function
    ADD CONSTRAINT fk_prf_role_function_fun FOREIGN KEY ( id_function )
        REFERENCES prf_function ( id_function );

ALTER TABLE prf_role_function
    ADD CONSTRAINT fk_prf_role_function_acc FOREIGN KEY ( id_access )
        REFERENCES prf_access ( id_access );

ALTER TABLE prf_role_menu
    ADD CONSTRAINT fk_prf_role_menu_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_role_menu
    ADD CONSTRAINT fk_prf_role_menu_role FOREIGN KEY ( id_role )
        REFERENCES prf_role ( id_role );

ALTER TABLE prf_role_menu
    ADD CONSTRAINT fk_prf_role_menu_menu FOREIGN KEY ( id_menu )
        REFERENCES prf_menu ( id_menu );

ALTER TABLE prf_user
    ADD CONSTRAINT fk_prf_user_sta FOREIGN KEY ( id_state )
        REFERENCES prf_state ( id_state );

ALTER TABLE prf_user_area
    ADD CONSTRAINT fk_prf_user_area_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_user_area
    ADD CONSTRAINT fk_prf_user_area_user FOREIGN KEY ( id_user )
        REFERENCES prf_user ( id_user );

ALTER TABLE prf_user_area
    ADD CONSTRAINT fk_prf_user_area_area FOREIGN KEY ( id_area )
        REFERENCES prf_area ( id_area );

ALTER TABLE prf_user_role
    ADD CONSTRAINT fk_prf_user_role_app FOREIGN KEY ( id_application )
        REFERENCES prf_application ( id_application );

ALTER TABLE prf_user_role
    ADD CONSTRAINT fk_prf_user_role_user FOREIGN KEY ( id_user )
        REFERENCES prf_user ( id_user );

ALTER TABLE prf_user_role
    ADD CONSTRAINT fk_prf_user_role_role FOREIGN KEY ( id_role )
        REFERENCES prf_role ( id_role );