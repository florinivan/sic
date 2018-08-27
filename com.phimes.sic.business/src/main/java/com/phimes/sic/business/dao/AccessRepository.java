package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Access;

@org.springframework.stereotype.Repository
public interface AccessRepository extends CrudRepository<Access, Character> {

	@Query("select acc.code, acc.description from Access acc join Function fz")
	Access getAccessFunction();

}
