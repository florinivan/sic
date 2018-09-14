package com.phimes.sic.business.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Menu;



@org.springframework.stereotype.Repository

public interface MenuRepository  extends CrudRepository<Menu, Long> {
	
	@Query("select mn from Menu mn join mn.roles rl where rl.code = :codeRl and rl.application.code = :codeApp and mn.code = :codePadre") 
	List<Menu> getAllMenuSubMenu(@Param("codeRl") String codeRl, @Param("codeApp")String codeApp, @Param("codePadre")String codePadre);
}
