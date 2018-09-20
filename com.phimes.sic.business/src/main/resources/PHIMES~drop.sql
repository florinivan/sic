ALTER TABLE prf_application DROP CONSTRAINT fk_prf_application;

ALTER TABLE prf_area DROP CONSTRAINT fk_prf_area_app;

ALTER TABLE prf_area DROP CONSTRAINT fk_prf_area_sta;

ALTER TABLE prf_area_filter DROP CONSTRAINT fk_prf_area_filter_app;

ALTER TABLE prf_area_filter DROP CONSTRAINT fk_prf_area_filter_area;

ALTER TABLE prf_area_filter DROP CONSTRAINT fk_prf_area_filter_lev;

ALTER TABLE prf_area_filter DROP CONSTRAINT fk_prf_area_filter_fil;

ALTER TABLE prf_filter DROP CONSTRAINT fk_prf_filter_app;

ALTER TABLE prf_filter DROP CONSTRAINT fk_prf_filter_lev;

ALTER TABLE prf_function DROP CONSTRAINT fk_prf_function_app;

ALTER TABLE prf_level DROP CONSTRAINT fk_prf_level_app;

ALTER TABLE prf_menu DROP CONSTRAINT fk_prf_menu_app;

ALTER TABLE prf_menu DROP CONSTRAINT fk_prf_sub_menu;

ALTER TABLE prf_parameter DROP CONSTRAINT fk_prf_parameter_app;

ALTER TABLE prf_role DROP CONSTRAINT fk_prf_role_app;

ALTER TABLE prf_role DROP CONSTRAINT fk_prf_role_sta;

ALTER TABLE prf_role_function DROP CONSTRAINT fk_prf_role_function_app;

ALTER TABLE prf_role_function DROP CONSTRAINT fk_prf_role_function_role;

ALTER TABLE prf_role_function DROP CONSTRAINT fk_prf_role_function_fun;

ALTER TABLE prf_role_function DROP CONSTRAINT fk_prf_role_function_acc;

ALTER TABLE prf_role_menu DROP CONSTRAINT fk_prf_role_menu_app;

ALTER TABLE prf_role_menu DROP CONSTRAINT fk_prf_role_menu_role;

ALTER TABLE prf_role_menu DROP CONSTRAINT fk_prf_role_menu_menu;

ALTER TABLE prf_user DROP CONSTRAINT fk_prf_user_sta;

ALTER TABLE prf_user_area DROP CONSTRAINT fk_prf_user_area_app;

ALTER TABLE prf_user_area DROP CONSTRAINT fk_prf_user_area_user;

ALTER TABLE prf_user_area DROP CONSTRAINT fk_prf_user_area_area;

ALTER TABLE prf_user_role DROP CONSTRAINT fk_prf_user_role_app;

ALTER TABLE prf_user_role DROP CONSTRAINT fk_prf_user_role_user;

ALTER TABLE prf_user_role DROP CONSTRAINT fk_prf_user_role_role;

DELETE FROM prf_access
WHERE
    id_access = 'a'
    AND description = 'acc_description_test'
    AND access_order = '1';

DELETE FROM prf_application
WHERE
    id_state = 'c'
    AND code = 'app_code_test'
    AND description = 'app_description_test'
    AND domain_code = 'dom_code_test'
    AND jump_profiling = 'Y'
    AND jump_profiling = 'N';

DELETE FROM prf_area
WHERE
    id_application = '1'
    AND id_state = 'c'
    AND code = 'ar_code_test'
    AND description = 'ar_description_test';

DELETE FROM prf_area_filter
WHERE
    id_application = '1'
    AND id_area = '1'
    AND id_level = '1'
    AND id_filter = '1';

DELETE FROM prf_filter
WHERE
    id_application = '1'
    AND id_level = '1'
    AND code = 'fil_code_test'
    AND description = 'fil_description_test'
    AND long_description = 'fil_long_description_test';

DELETE FROM prf_function
WHERE
    id_application = '1'
    AND code = 'fun_code_test'
    AND description = 'fun_description_test';

DELETE FROM prf_level
WHERE
    id_application = '1'
    AND code = 'lev_code_test'
    AND description = 'lev_description_test'
    AND level_order = '2';

DELETE FROM prf_menu
WHERE
    id_application = '1'
    AND id_sub_menu = '1'
    AND code = 'mn_code_test'
    AND description = 'mn_description_test'
    AND url = 'url_test'
    AND menu_order = '3';

DELETE FROM prf_parameter
WHERE
    id_application = '1'
    AND id_parameter = 'd'
    AND value = 'par_value_test';

DELETE FROM prf_role
WHERE
    id_application = '1'
    AND id_state = 'c'
    AND code = 'rl_code_test'
    AND description = 'rl_description_test';

DELETE FROM prf_role_function
WHERE
    id_application = '1'
    AND id_role = '1'
    AND id_function = '1'
    AND id_access = 'a';

DELETE FROM prf_role_menu
WHERE
    id_application = '1'
    AND id_role = '1'
    AND id_menu = '1';

DELETE FROM prf_state
WHERE
    id_state = 'c'
    AND description = 'st_description_test'
    AND state_order = '4';

DELETE FROM prf_user
WHERE
    id_state = 'c'
    AND username = 'us_username_test'
    AND domain_code = 'us_dom_code';

DELETE FROM prf_user_area
WHERE
    id_application = '1'
    AND id_user = '1'
    AND id_area = '1';

DELETE FROM prf_user_role
WHERE
    id_application = '1'
    AND id_user = '1'
    AND id_role = '1';

ALTER TABLE prf_access DROP CONSTRAINT prf_access_pk;

ALTER TABLE prf_application DROP CONSTRAINT prf_application_pk;

ALTER TABLE prf_area DROP CONSTRAINT prf_area_pk;

ALTER TABLE prf_filter DROP CONSTRAINT prf_filter_pk;

ALTER TABLE prf_function DROP CONSTRAINT prf_function_pk;

ALTER TABLE prf_level DROP CONSTRAINT prf_level_pk;

ALTER TABLE prf_menu DROP CONSTRAINT prf_menu_pk;

ALTER TABLE prf_parameter DROP CONSTRAINT prf_parameter_pk;

ALTER TABLE prf_role DROP CONSTRAINT prf_role_pk;

ALTER TABLE prf_state DROP CONSTRAINT prf_state_pk;

ALTER TABLE prf_user DROP CONSTRAINT prf_user_pk;

ALTER TABLE prf_access DROP CONSTRAINT prf_access_uq;

ALTER TABLE prf_application DROP CONSTRAINT prf_application_uq;

ALTER TABLE prf_application DROP CONSTRAINT prf_area_uq;

ALTER TABLE prf_filter DROP CONSTRAINT prf_filter_uq;

ALTER TABLE prf_function DROP CONSTRAINT prf_function_uq;

ALTER TABLE prf_level DROP CONSTRAINT prf_level_uk;

ALTER TABLE prf_menu DROP CONSTRAINT prf_menu_uk;

ALTER TABLE prf_role DROP CONSTRAINT prf_role_uk;

ALTER TABLE prf_state DROP CONSTRAINT prf_stato_uq;

ALTER TABLE prf_utente DROP CONSTRAINT prf_user_uk;

DROP INDEX prf_area_filter_applica_level;

DROP INDEX prf_role_function_uq;

DROP INDEX prf_role_menu_uq;

DROP INDEX prf_user_area_uq;

DROP INDEX prf_user_role_uq;

ALTER TABLE prf_application DROP CONSTRAINT prf_ck_app_profiling_dates;

ALTER TABLE prf_application DROP CONSTRAINT prf_ck_app_jump_profiling;

DROP TRIGGER prf_access_create_ts;

DROP TRIGGER prf_access_modify_ts;

DROP TRIGGER prf_application_trg;

DROP TRIGGER prf_application_create_ts;

DROP TRIGGER prf_application_modify_ts;

DROP TRIGGER prf_area_trg;

DROP TRIGGER prf_area_create_ts;

DROP TRIGGER prf_area_modify_ts;

DROP TRIGGER prf_area_filter_create_ts;

DROP TRIGGER prf_area_filter_modify_ts;

DROP TRIGGER prf_filter_trg;

DROP TRIGGER prf_filter_create_ts;

DROP TRIGGER prf_filter_modify_ts;

DROP TRIGGER prf_function_trg;

DROP TRIGGER prf_function_create_ts;

DROP TRIGGER prf_function_modify_ts;

DROP TRIGGER prf_level_trg;

DROP TRIGGER prf_level_create_ts;

DROP TRIGGER prf_level_modify_ts;

DROP TRIGGER prf_menu_trg;

DROP TRIGGER prf_menu_create_ts;

DROP TRIGGER prf_menu_modify_ts;

DROP TRIGGER prf_parameter_create_ts;

DROP TRIGGER prf_parameter_modify_ts;

DROP TRIGGER prf_role_trg;

DROP TRIGGER prf_role_create_ts;

DROP TRIGGER prf_role_modify_ts;

DROP TRIGGER prf_role_function_create_ts;

DROP TRIGGER prf_role_menu_create_ts;

DROP TRIGGER prf_state_create_ts;

DROP TRIGGER prf_state_modify_ts;

DROP TRIGGER prf_user_trg;

DROP TRIGGER prf_user_create_ts;

DROP TRIGGER prf_user_modify_ts;

DROP TRIGGER prf_user_area_create_ts;

DROP TRIGGER prf_user_role_create_ts;

DROP SEQUENCE prf_application_seq;

DROP SEQUENCE prf_area_seq;

DROP SEQUENCE prf_filter_seq;

DROP SEQUENCE prf_function_seq;

DROP SEQUENCE prf_level_seq;

DROP SEQUENCE prf_menu_seq;

DROP SEQUENCE prf_role_seq;

DROP SEQUENCE prf_user_seq;

DROP VIEW access_access;

DROP VIEW filter;

DROP VIEW function;

DROP VIEW area;

DROP VIEW level_level;

DROP VIEW menu;

DROP VIEW profileaccessor;

DROP VIEW role;

DROP VIEW userprofile;

DROP TABLE prf_access;

DROP TABLE prf_application;

DROP TABLE prf_area;

DROP TABLE prf_area_filter;

DROP TABLE prf_filter;

DROP TABLE prf_function;

DROP TABLE prf_level;

DROP TABLE prf_menu;

DROP TABLE prf_parameter;

DROP TABLE prf_role;

DROP TABLE prf_role_function;

DROP TABLE prf_role_menu;

DROP TABLE prf_state;

DROP TABLE prf_user;

DROP TABLE prf_user_area;

DROP TABLE prf_user_role;