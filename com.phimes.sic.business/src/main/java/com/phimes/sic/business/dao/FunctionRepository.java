package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Access;
import com.phimes.sic.business.model.Function;

import antlr.collections.List;

@org.springframework.stereotype.Repository

public interface FunctionRepository extends CrudRepository<Function, Long> {

	@Query("select fz.code, fz.description, fz.idAccess, from Function fz join Access acc join Role rl where rl.code =: codeRl and acc.idAccess =: idAccessAcc and fz.code =:codeFz")
	java.util.List<Function> getFunctionRoleBy(@Param("codeRl") String codeRl);
	java.util.List<Access> getFunctionAccessBy(@Param("idAccess") Character idAccess);
	
	@Query("select fz.code, fz.description, fz.idAccess, from Function fz join Application app where app.code =: codeApp and fz.code =: codeFz")
	Function findOne(@Param("codeApp") String codeApp, @Param("codeFz") String codeFz);

}
