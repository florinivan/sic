package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Function;

@org.springframework.stereotype.Repository

public interface FunctionRepository extends CrudRepository<Function, Long> {
	
	@Query("select fz.code, fz.description, fz.accesses from Function fz join Access acc")
	Stream getFunctionAccess();

}
