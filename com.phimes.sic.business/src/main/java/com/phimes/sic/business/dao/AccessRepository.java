package com.phimes.sic.business.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.*;

@org.springframework.stereotype.Repository
public interface AccessRepository extends CrudRepository<Access, Character> {

	@Query("select f.accesses from Function f where f.code= :codeFz")
	Set<Access>  getAccessFunction(@Param("codeFz") String codeFz);

}
