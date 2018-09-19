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