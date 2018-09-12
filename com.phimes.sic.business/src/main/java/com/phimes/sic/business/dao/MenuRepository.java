package com.phimes.sic.business.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Menu;



@org.springframework.stereotype.Repository

public interface MenuRepository  extends CrudRepository<Menu, Long> {
	
	@Query("select mn.code, mn.description, mn.url, mn.menuOrder, mn.idSubMenu from Menu mn join Application app join Role rl where rl.code =: codeRl and app.code =: codeApp and mn.code =: codeMn") 
	List<Menu> getAllMenuSubMenu(@Param("codeRl") String codeRl, @Param("codeApp")String codeApp, @Param("codeMn")String codeMn);
}
