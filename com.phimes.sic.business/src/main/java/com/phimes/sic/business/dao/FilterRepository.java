package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Filter;

@org.springframework.stereotype.Repository

public interface FilterRepository extends CrudRepository<Filter, Long> {

	@Query("select fl.code, fl.description, fl.longDescription, lv from Filter fl join Level lv")
	Filter getFilterLevelBy();
}
