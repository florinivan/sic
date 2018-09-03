package com.phimes.sic.business.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Level;

@org.springframework.stereotype.Repository

public interface LevelRepository extends CrudRepository<Level, Long> {
	
	@Query("select lv.code, lv.description, lv.levelOrder from Level lv  join Application app where app.code=:codeApp")
	List<Level> getLevelListBy(@Param("codeApp")String codeApp);
	
	@Query("select lv.code, lv.description, lv.levelOrder from Filter fl join Level lv join Application app  where app.code=:codeApp and fl.code=:codeFl")
	Stream<Level> findOne(@Param("codeApp")String codeApp, @Param("codeFl") String codeFl);
	

}
