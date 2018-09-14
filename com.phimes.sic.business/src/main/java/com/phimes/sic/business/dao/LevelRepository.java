package com.phimes.sic.business.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Level;

@org.springframework.stereotype.Repository

public interface LevelRepository extends CrudRepository<Level, Long> {
	
	@Query("select lv from Level lv where lv.application.code=:codeApp")
	List<Level> getLevelListBy(@Param("codeApp")String codeApp);
	
	@Query("select fl.level from Filter fl join fl.level  where fl.level.code=:codeApp and fl.code=:codeFl")
	Level findOne(@Param("codeApp")String codeApp, @Param("codeFl") String codeFl);
	

}
