package com.phimes.sic.business.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Role;

@org.springframework.stereotype.Repository

public interface RoleRepository extends CrudRepository<Role, Long> {

	@Query("select rl from User usr join usr.roles rl where rl.application.code = :codeApp and usr.username = :codeUsr and rl.state.idState = :idStateRl")
	Set<Role> getRoleList(@Param("codeApp") String codeApp, @Param("codeUsr") String codeUsr, @Param("idStateRl") Character idStateRl);

}