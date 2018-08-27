package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Menu;

@org.springframework.stereotype.Repository

public interface MenuRepository  extends CrudRepository<Menu, Long> {
	
	@Query("select mn.code, mn.description, mn.url, mn.order, from Menu mn") //rl.subMenu
	Menu getAllMenuSubMenu();
}
