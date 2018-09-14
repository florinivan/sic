package com.phimes.sic.business.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Area;

@org.springframework.stereotype.Repository

public interface AreaRepository extends CrudRepository<Area, Long> {
	
	@Query("select usr.areas from  User usr join usr.areas r where usr.idUser = :codeUsr and r.application.code = :codeApp")
	Set<Area> getAreaList(@Param("codeUsr") String codeUsr, @Param("codeApp") String codeApp);




}
