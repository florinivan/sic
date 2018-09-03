package com.phimes.sic.business.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Access;

@org.springframework.stereotype.Repository
public interface AccessRepository extends CrudRepository<Access, Character> {

	@Query("select acc.idAccess, acc.description from Access acc join Function fz where fz.code= :code_fz")
	List<Access>  getAccessFunction(@Param("code_fz") String code_fz);

}
