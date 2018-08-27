package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Area;

@org.springframework.stereotype.Repository

public interface AreaRepository extends CrudRepository<Area, Long> {
	
	@Query("select ar.codice, ar.descrizione, fl from Area ar join Filter fl")
	Area getAreaFilterBy();

}
