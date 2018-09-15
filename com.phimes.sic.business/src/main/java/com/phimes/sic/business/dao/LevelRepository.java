package com.phimes.sic.business.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Level;

@org.springframework.stereotype.Repository

public interface LevelRepository extends CrudRepository<Level, Long> {

	@Query("select lv from Filter fl join fl.level lv where lv.application.code = :codeApp and fl.code= :codeFl")
	Level findOne(@Param("codeApp") String codeApp, @Param("codeFl") String codeFl);

}
