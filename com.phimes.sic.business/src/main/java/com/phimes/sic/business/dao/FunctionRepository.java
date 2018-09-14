package com.phimes.sic.business.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Function;


@org.springframework.stereotype.Repository

public interface FunctionRepository extends CrudRepository<Function, Long> {

	@Query("select rl.functions from Role rl join rl.functions fz where rl.code = :codeRl and rl.application.code =:codeApp")
	Set<Function> getFunctionRoleBy(@Param("codeRl") String codeRl, @Param("codeApp") String codeApp);

	/*@Query("select fz from Function fz where fz.application.code = :codeApp and fz.code = :codeFz")
	Function findOne(@Param("codeApp") String codeApp, @Param("codeFz") String codeFz);*/
}