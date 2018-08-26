package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Role;

@org.springframework.stereotype.Repository

public interface RoleRepository  extends CrudRepository<Role, Long> {
	
	@Query("select rl.code, rl.description, fz, mn from Role rl join Function fz join Menu mn")
	Stream getFunctionMenu();

}