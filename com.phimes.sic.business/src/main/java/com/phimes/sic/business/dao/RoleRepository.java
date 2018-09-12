package com.phimes.sic.business.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Role;

@org.springframework.stereotype.Repository

public interface RoleRepository  extends CrudRepository<Role, Long> {
	
	@Query("select rl.code, rl.description, from Role rl join User usr join Function fz join Menu mn join Application app where app.code =:codeApp and mn.code =: codeMn and fz.code =: codeFz and usr.code =: codeUsr and rl.code =: codeRl")
	Role findOne(@Param("codeApp")String codeApp, @Param("codeMn") String codeMn, @Param("codeFz") String codeFz, @Param("codeUsr")String codeUsr, @Param("codeRl") String codeRl);

}