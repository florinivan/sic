package com.phimes.sic.business.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

	@Query("select domainCode from User usr where usr.username = :usernameUsr")
	Set<String> getDomainList(@Param("usernameUsr") String usernameUsr);

	@Query("select usr from User usr where usr.domainCode = :domainCodeUsr and usr.username = :usernameUsr")
	User findOne(@Param("domainCodeUsr") String domainCodeUsr, @Param("usernameUsr") String usernameUsr);

}
