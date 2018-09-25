package com.phimes.sic.business.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.business.model.Area;

@org.springframework.stereotype.Repository

public interface AreaRepository extends CrudRepository<Area, String> {
	
	@Query("select usr.areas from  User usr join usr.areas r where usr.username = :username and r.application.code = :codeApp")
	Set<Area> getAreaList(@Param("username") String username, @Param("codeApp") String codeApp);




}
