select prf_utente.username, prf_utente_ruolo.id_utente, prf_utente_ruolo.id_ruolo, prf_ruolo.codice, prf_ruolo.descrizione, prf_area.codice, 
       prf_area.descrizione, prf_utente_area.id_utente, prf_utente_area.id_area
    from prf_utente
        join prf_utente_ruolo
            on prf_utente.id_utente = prf_utente_ruolo.id_utente
        join prf_ruolo
            on prf_utente_ruolo.id_utente = prf_ruolo.id_ruolo
        join prf_area
            on prf_ruolo.id_ruolo = prf_area.id_area
        join prf_utente_area
            on prf_area.id_area = prf_utente_area.id_area;
         

create or replace view UserProfile as 
    select utente.username, prf_utente_ruolo.id_utente, prf_utente_ruolo.id_ruolo, prf_ruolo.codice, prf_ruolo.descrizione, prf_area.codice area_codice, 
           prf_area.descrizione area_descrizione, prf_utente_area.id_area
        from prf_utente utente
            join prf_utente_ruolo
                on utente.id_utente = prf_utente_ruolo.id_utente
            join prf_ruolo
                on prf_utente_ruolo.id_ruolo = prf_ruolo.id_ruolo
            join prf_utente_area
                on prf_utente_area.id_utente = utente.id_utente
            join prf_area
                on prf_utente_area.id_area = prf_area.id_area;
        
        
select prf_area.id_area, prf_area.codice, prf_area.descrizione, userprofile.id_utente, userprofile.area_codice, userprofile.area_descrizione, userprofile.codice, 
       userprofile.descrizione,userprofile.id_area, userprofile.id_ruolo, userprofile.username, prf_filtro.id_filtro, prf_filtro.codice, prf_filtro.descrizione, 
       prf_filtro.descrizione_lunga, prf_filtro.id_livello
    from prf_area 
        join userprofile
            on prf_area.id_area = userprofile.id_area
        join prf_filtro
            on userprofile.id_area = prf_filtro.id_filtro;
                
                       
create or replace view Area as
    select userprofile.area_codice, userprofile.area_descrizione, userprofile.codice userprofile_codice, 
           userprofile.descrizione userprofile_descrizione, userprofile.id_ruolo, userprofile.id_utente, userprofile.username, prf_filtro.id_filtro, 
           prf_filtro.descrizione_lunga, prf_filtro.id_livello
        from userprofile
            join prf_filtro
                on userprofile.id_area = prf_filtro.id_filtro;
    
    
select prf_filtro.id_filtro, prf_filtro.codice, prf_filtro.descrizione, prf_filtro.descrizione_lunga, prf_filtro.id_livello, prf_area.codice, prf_area.descrizione,
       prf_livello.codice, prf_livello.descrizione, prf_livello.ordine
    from prf_filtro
        join prf_area
            on prf_filtro.id_filtro = prf_area.id_area
        join prf_livello
            on prf_area.id_area = prf_livello.id_livello;
    
    
create or replace view Filter as
    select prf_filtro.id_filtro, prf_filtro.codice, prf_filtro.descrizione, prf_filtro.descrizione_lunga, prf_filtro.id_livello, prf_area.codice area_codice, 
           prf_area.descrizione area_descrizione, prf_livello.codice livello_codice, prf_livello.descrizione livello_descrizione, prf_livello.ordine
        from prf_filtro
            join prf_area
                on prf_filtro.id_filtro = prf_area.id_area
            join prf_livello
                on prf_area.id_area = prf_livello.id_livello;
    
    
select prf_livello.id_livello, prf_livello.codice, prf_livello.descrizione, prf_livello.ordine, prf_filtro.id_filtro, prf_filtro.codice, prf_filtro.descrizione, 
       prf_filtro.descrizione_lunga, prf_filtro.id_livello
    from prf_livello
        join prf_filtro
            on prf_livello.id_livello = prf_filtro.id_filtro;
    
    
create or replace view Livello as
    select prf_livello.id_livello, prf_livello.codice, prf_livello.descrizione, prf_livello.ordine, prf_filtro.id_filtro, prf_filtro.codice filtro_codice, 
           prf_filtro.descrizione filtro_descrizione, prf_filtro.descrizione_lunga, prf_filtro.id_livello filtro_id_livello
        from (prf_livello
            join prf_filtro
                on prf_livello.id_livello = prf_filtro.id_filtro);
    
   
select prf_ruolo.id_ruolo, prf_ruolo.codice, prf_ruolo.descrizione, userprofile.id_utente, userprofile.area_codice, userprofile.area_descrizione, userprofile.codice, 
       userprofile.descrizione,userprofile.id_area, userprofile.id_ruolo, userprofile.username, prf_funzione.id_funzione, prf_funzione.codice, prf_funzione.descrizione,
       prf_menu.id_menu, prf_menu.codice, prf_menu.descrizione, prf_menu.url, prf_menu.ordine
    from prf_ruolo 
        join userprofile
            on prf_ruolo.id_ruolo = userprofile.id_ruolo
        join prf_funzione
            on userprofile.id_ruolo = prf_funzione.id_funzione
        join prf_menu
            on prf_funzione.id_funzione = prf_menu.id_menu;
      
      
create or replace view Role as 
    select prf_ruolo.id_ruolo ruolo_id_ruolo, prf_ruolo.codice ruolo_codice, prf_ruolo.descrizione ruolo_descrizione, userprofile.id_utente, userprofile.area_codice, 
           userprofile.area_descrizione, userprofile.codice, userprofile.descrizione,userprofile.id_area, userprofile.id_ruolo, userprofile.username, 
           prf_funzione.id_funzione, prf_funzione.codice funzione_codice, prf_funzione.descrizione funzione_descrizione, prf_menu.id_menu,
           prf_menu.codice menu_codice, prf_menu.descrizione menu_descrizione, prf_menu.url, prf_menu.ordine
        from prf_ruolo 
            join userprofile
                on prf_ruolo.id_ruolo = userprofile.id_ruolo
            join prf_funzione
                on userprofile.id_ruolo = prf_funzione.id_funzione
            join prf_menu
                on prf_funzione.id_funzione = prf_menu.id_menu;
      
      
select prf_menu.id_menu, prf_menu.codice, prf_menu.descrizione, prf_menu.url, prf_menu.ordine, prf_ruolo.id_ruolo, prf_ruolo.descrizione, prf_ruolo.codice
    from prf_menu
        inner join prf_ruolo
            on prf_menu.id_menu = prf_ruolo.id_ruolo;
    
    
create or replace view Menu as
    select prf_menu.id_menu, prf_menu.codice, prf_menu.descrizione, prf_menu.url, prf_menu.ordine, prf_ruolo.id_ruolo, prf_ruolo.descrizione ruolo_descrizione, prf_ruolo.codice ruolo_codice
        from prf_menu
            join prf_ruolo
                on prf_menu.id_menu = prf_ruolo.id_ruolo;
    
    
select prf_funzione.id_funzione, prf_funzione.codice, prf_funzione.descrizione, prf_ruolo.id_ruolo, prf_ruolo.descrizione, prf_ruolo.codice, prf_accesso.id_accesso, 
       prf_accesso.descrizione, prf_accesso.ordine
    from((prf_funzione
        join prf_ruolo
            on prf_funzione.id_funzione = prf_ruolo.id_ruolo)
        join prf_accesso
            on prf_ruolo.id_ruolo = prf_accesso.id_accesso);
    
    
create or replace view Function as
    select prf_funzione.id_funzione, prf_funzione.codice, prf_funzione.descrizione, prf_ruolo.id_ruolo, prf_ruolo.descrizione ruolo_descrizione, prf_ruolo.codice ruolo_codice, 
           prf_accesso.id_accesso, prf_accesso.descrizione accesso_descrizione, prf_accesso.ordine
        from((prf_funzione
            join prf_ruolo
                on prf_funzione.id_funzione = prf_ruolo.id_ruolo)
            join prf_accesso
                on prf_ruolo.id_ruolo = prf_accesso.id_accesso);
  
  
select prf_accesso.id_accesso, prf_accesso.descrizione, prf_accesso.ordine, prf_funzione.id_funzione, prf_funzione.codice, prf_funzione.descrizione
    from (prf_accesso
        join prf_funzione
            on prf_accesso.id_accesso = prf_funzione.id_funzione);
    
    
create or replace view Accesso as
    select prf_accesso.id_accesso, prf_accesso.descrizione, prf_accesso.ordine, prf_funzione.id_funzione, prf_funzione.codice, prf_funzione.descrizione funzione_descrizione
        from prf_accesso
            join prf_funzione
                on prf_accesso.id_accesso = prf_funzione.id_funzione;
    
    
select userprofile.id_utente, userprofile.area_codice,userprofile.area_descrizione, userprofile.codice, userprofile.descrizione,userprofile.id_area, 
       userprofile.id_ruolo, userprofile.username, prf_livello.id_livello, prf_livello.codice, prf_livello.descrizione, prf_livello.ordine, prf_filtro.id_filtro, 
       prf_filtro.codice, prf_filtro.descrizione, prf_filtro.descrizione_lunga, prf_filtro.id_livello,prf_ruolo.id_ruolo ruolo_id_ruolo, prf_ruolo.codice ruolo_codice, 
       prf_ruolo.descrizione ruolo_descrizione
    from userprofile
        join prf_livello
            on userprofile.id_utente = prf_livello.id_livello
        join prf_filtro 
            on prf_livello.id_livello = prf_filtro.id_filtro
        join prf_ruolo
            on prf_filtro.id_filtro = prf_ruolo.id_ruolo;
    
    
create or replace view ProfileAccessor as 
    select userprofile.id_utente, userprofile.area_codice,userprofile.area_descrizione, userprofile.codice, userprofile.descrizione,userprofile.id_area, 
           userprofile.id_ruolo, userprofile.username, prf_livello.id_livello, prf_livello.codice livello_codice, prf_livello.descrizione livello_descrizione, prf_livello.ordine, 
           prf_filtro.id_filtro, prf_filtro.codice filtro_codice, prf_filtro.descrizione filtro_descrizione, prf_filtro.descrizione_lunga, prf_filtro.id_livello filtro_id_livello, 
           prf_ruolo.id_ruolo ruolo_id_ruolo, prf_ruolo.codice ruolo_codice, prf_ruolo.descrizione ruolo_descrizione
        from userprofile
            join prf_livello
                on userprofile.id_utente = prf_livello.id_livello
            join prf_filtro 
                on prf_livello.id_livello = prf_filtro.id_filtro
            join prf_ruolo
                on prf_filtro.id_filtro = prf_ruolo.id_ruolo;