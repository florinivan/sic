select prf_user.username, prf_user_role.id_user, prf_user_role.id_role, prf_role.code, prf_role.description, prf_area.code, 
       prf_area.description, prf_user_area.id_user, prf_user_area.id_area
    from prf_user
        join prf_user_role
            on prf_user.id_user = prf_user_role.id_user
        join prf_role
            on prf_user_role.id_user = prf_role.id_role
        join prf_area
            on prf_role.id_role = prf_area.id_area
        join prf_user_area
            on prf_area.id_area = prf_user_area.id_area;
         

create or replace view UserProfile as 
    select prf_user.username, prf_user_role.id_user, prf_user_role.id_role, prf_role.code, prf_role.description, prf_area.code area_code, 
           prf_area.description area_description, prf_user_area.id_area
        from prf_user
            join prf_user_role
                on prf_user.id_user = prf_user_role.id_user
            join prf_role
                on prf_user_role.id_role = prf_role.id_role
            join prf_user_area
                on prf_user_area.id_user = prf_user.id_user
            join prf_area
                on prf_user_area.id_area = prf_area.id_area;
        
        
select prf_area.id_area, prf_area.code, prf_area.description, userprofile.id_user, userprofile.area_code, userprofile.area_description, userprofile.code, 
       userprofile.description, userprofile.id_area, userprofile.id_role, userprofile.username, prf_filter.id_filter, prf_filter.code, prf_filter.description, 
       prf_filter.long_description, prf_filter.id_level
    from prf_area 
        join userprofile
            on prf_area.id_area = userprofile.id_area
        join prf_filter
            on userprofile.id_area = prf_filter.id_filter;
                
                       
create or replace view Area as
    select userprofile.area_code, userprofile.area_description, userprofile.code userprofile_code, 
           userprofile.description userprofile_description, userprofile.id_role, userprofile.id_user, userprofile.username, prf_filter.id_filter, 
           prf_filter.long_description, prf_filter.id_level
        from userprofile
            join prf_filter
                on userprofile.id_area = prf_filter.id_filter;
    
    
select prf_filter.id_filter, prf_filter.code, prf_filter.description, prf_filter.long_description, prf_filter.id_level, prf_area.code, prf_area.description,
      prf_level.id_level, prf_level.code, prf_level.description, prf_level.level_order
    from prf_filter
        join prf_area
            on prf_filter.id_filter = prf_area.id_area
        join prf_level
            on prf_area.id_area = prf_level.id_level;
    
    
create or replace view Filter as
    select prf_filter.id_filter, prf_filter.code, prf_filter.description, prf_filter.long_description, prf_filter.id_level, prf_area.code area_code, 
           prf_area.description area_description, prf_level.code level_code, prf_level.description level_description, prf_level.level_order
        from prf_filter
            join prf_area
                on prf_filter.id_filter = prf_area.id_area
            join prf_level
                on prf_area.id_area = prf_level.id_level;
    
    
select prf_level.id_level, prf_level.code, prf_level.description, prf_level.level_order, prf_filter.id_filter, prf_filter.code, prf_filter.description, 
       prf_filter.long_description, prf_filter.id_level
    from prf_level
        join prf_filter
            on prf_level.id_level = prf_filter.id_filter;
    
    
create or replace view Level_Level as
    select prf_level.id_level, prf_level.code, prf_level.description, prf_level.level_order, prf_filter.id_filter, prf_filter.code filter_code, 
           prf_filter.description filter_description, prf_filter.long_description, prf_filter.id_level filter_id_level
        from prf_level
            join prf_filter
                on prf_level.id_level = prf_filter.id_filter;
    
   
select prf_role.id_role, prf_role.code, prf_role.description, userprofile.id_user, userprofile.area_code, userprofile.area_description, userprofile.code, 
       userprofile.description, userprofile.id_area, userprofile.id_role, userprofile.username, prf_function.id_function, prf_function.code, prf_function.description,
       prf_menu.id_menu, prf_menu.code, prf_menu.description, prf_menu.url, prf_menu.menu_order
    from prf_role
        join userprofile
            on prf_role.id_role = userprofile.id_role
        join prf_function
            on userprofile.id_role = prf_function.id_function
        join prf_menu
            on prf_function.id_function = prf_menu.id_menu;
      
      
create or replace view Role as 
    select prf_role.id_role ruolo_id_role, prf_role.code role_code, prf_role.description role_description, userprofile.id_user, userprofile.area_code, 
           userprofile.area_description, userprofile.code, userprofile.description, userprofile.id_area, userprofile.id_role, userprofile.username, 
           prf_function.id_function, prf_function.code function_code, prf_function.description function_description, prf_menu.id_menu,
           prf_menu.code menu_code, prf_menu.description menu_description, prf_menu.url, prf_menu.menu_order
        from prf_role
            join userprofile
                on prf_role.id_role = userprofile.id_role
            join prf_function
                on userprofile.id_role = prf_function.id_function
            join prf_menu
                on prf_function.id_function = prf_menu.id_menu;
      
      
select prf_menu.id_menu, prf_menu.code, prf_menu.description, prf_menu.url, prf_menu.menu_order, prf_role.id_role, prf_role.description, prf_role.code
    from prf_menu
        inner join prf_role
            on prf_menu.id_menu = prf_role.id_role;
    
    
create or replace view Menu as
    select prf_menu.id_menu, prf_menu.code, prf_menu.description, prf_menu.url, prf_menu.menu_order, prf_role.id_role, prf_role.description role_description, prf_role.code role_code
        from prf_menu
            join prf_role
                on prf_menu.id_menu = prf_role.id_role;
    
    
select prf_function.id_function, prf_function.code, prf_function.description, prf_role.id_role, prf_role.description, prf_role.code, prf_access.id_access, 
       prf_access.description, prf_access.access_order
    from prf_function
        join prf_role
            on prf_function.id_function = prf_role.id_role
        join prf_access
            on prf_role.id_role = prf_access.id_access;
    
    
create or replace view Function as
    select prf_function.id_function, prf_function.code, prf_function.description, prf_role.id_role, prf_role.description role_description, prf_role.code role_code, 
           prf_access.id_access, prf_access.description access_description, prf_access.access_order
        from prf_function
            join prf_role
                on prf_function.id_function = prf_role.id_role
            join prf_access
                on prf_role.id_role = prf_access.id_access;
  
  
select prf_access.id_access, prf_access.description, prf_access.access_order, prf_function.id_function, prf_function.code, prf_function.description
    from prf_access
        join prf_function
            on prf_access.id_access = prf_function.id_function;
    
    
create or replace view Access_Access as
    select prf_access.id_access, prf_access.description, prf_access.access_order, prf_function.id_function, prf_function.code, prf_function.description function_description
        from prf_access
            join prf_function
                on prf_access.id_access = prf_function.id_function;
    
    
select userprofile.id_user, userprofile.area_code,userprofile.area_description, userprofile.code, userprofile.description,userprofile.id_area, 
       userprofile.id_role, userprofile.username, prf_level.id_level, prf_level.code, prf_level.description, prf_level.level_order, prf_filter.id_filter, 
       prf_filter.code, prf_filter.description, prf_filter.long_description, prf_filter.id_level, prf_role.id_role role_id_role, prf_role.code role_code, 
       prf_role.description role_description
    from userprofile
        join prf_level
            on userprofile.id_user = prf_level.id_level
        join prf_filter
            on prf_level.id_level = prf_filter.id_filter
        join prf_role
            on prf_filter.id_filter = prf_role.id_role;
    
    
create or replace view ProfileAccessor as 
    select userprofile.id_user, userprofile.area_code, userprofile.area_description, userprofile.code, userprofile.description, userprofile.id_area, 
           userprofile.id_role, userprofile.username, prf_level.id_level, prf_level.code level_code, prf_level.description level_description, prf_level.level_order, 
           prf_filter.id_filter, prf_filter.code filter_code, prf_filter.description filter_description, prf_filter.long_description, prf_filter.id_level filter_id_level, 
           prf_role.id_role role_id_role, prf_role.code role_code, prf_role.description role_description
        from userprofile
            join prf_level
                on userprofile.id_user = prf_level.id_level
            join prf_filter
                on prf_level.id_level = prf_filter.id_filter
            join prf_role
                on prf_filter.id_filter = prf_role.id_role;