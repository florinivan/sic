package com.phimes.sic.business.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Role;

@org.springframework.stereotype.Repository

public interface RoleRepository  extends CrudRepository<Role, Long> {
	
	@Query("select rl.code, rl.description, fz, mn from User usr join Role rl join Function fz join Menu mn where usr.idUser= idUser")
	List<Role> getRoleList(@Param("idUser")String idUser);

}