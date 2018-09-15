package com.phimes.sic.business.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Function;

@org.springframework.stereotype.Repository

public interface FunctionRepository extends CrudRepository<Function, Long> {

	@Query("select fz from Function fz join fz.roles rl where rl.code = :codeRl and rl.application.code =:codeApp")
	Set<Function> getFunctionRoleBy(@Param("codeRl") String codeRl, @Param("codeApp") String codeApp);
}
