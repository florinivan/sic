package com.phimes.sic.business.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Query("select domainCode from User usr where usr.username = :username")
	Set<String> getDomainList(@Param("username") String username);

	@Query("select usr from User usr where usr.domainCode = :domainCodeUsr and usr.username = :username")
	User findOne(@Param("domainCodeUsr") String domainCodeUsr, @Param("username") String username);

}
