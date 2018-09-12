package com.phimes.sic.business.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Access;
import com.phimes.sic.business.model.Function;


@org.springframework.stereotype.Repository

public interface FunctionRepository extends CrudRepository<Function, Long> {

	@Query("select fz.code, fz.description from Function fz join Role rl join Application app where rl.code =: codeRl and app.code =:codeApp and fz.code =: codeFz")
	List<Function> getFunctionRoleBy(@Param("codeRl") String codeRl, @Param("codeApp") String codeApp, @Param("codeFz") String codeFz);

	@Query("select fz.code, fz.description from Function fz join Role rl join Application app where rl.code =: codeRl and app.code =:codeApp and fz.code =: codeFz")
	Function findOne(@Param("codeRl") String codeRl, @Param("codeApp") String codeApp, @Param("codeFz") String codeFz);
}