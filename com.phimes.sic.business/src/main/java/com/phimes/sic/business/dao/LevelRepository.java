package com.phimes.sic.business.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Level;

@org.springframework.stereotype.Repository

public interface LevelRepository extends CrudRepository<Level, Long> {

	@Query("select lv from Filter fl join fl.level lv where lv.application.code = :codeApp and fl.code= :codeFl")
	Level findOne(@Param("codeApp") String codeApp, @Param("codeFl") String codeFl);

	@Query("select lv from Filter fl join fl.level lv where lv.application.code = :codeApp and fl.code= :codeFl")
	Set<Level> getLevelList(@Param("codeApp") String codeApp, @Param("codeFl") String codeFl);
	
	//Per ProfileAccessor 
	@Query("select lv from Filter fl join fl.level lv where fl.areas.code = :codeArea")
	Set<Level> getLevelListByArea(@Param("codeArea") String codeAr);

}
