package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Menu;

@org.springframework.stereotype.Repository

public interface MenuRepository  extends CrudRepository<Menu, Long> {
	
	@Query("select mn.codice, mn.descrizione, mn.url, mn.ordine, from Menu mn") //rl.subMenu
	Stream getAllMenuSubMwnu();
}
