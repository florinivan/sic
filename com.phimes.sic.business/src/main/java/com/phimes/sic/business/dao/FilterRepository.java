package com.phimes.sic.business.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Filter;

@org.springframework.stereotype.Repository

public interface FilterRepository extends CrudRepository<Filter, Long> {

	@Query("select lv.filters from Level lv join lv.filters fl join fl.areas ar where ar.code = :codeAr and lv.code = :codeLv")
	Set<Filter> getFilterList(@Param("codeAr") String codeAr, @Param("codeLv") String codeLv);
	
	
	@Query("select lv.filters from Level lv join lv.filters fl join fl.areas ar where lv.application.code = :codeApp")
	Set<Filter> getFilterList(@Param("codeApp") String codeApp);
	
	@Query("select lv.filters from Level lv join lv.filters fl where lv.application.code = :codeApp and lv.code = :codeLv")
	Set<Filter> getFilterListByLevel(@Param("codeApp") String codeApp, @Param("codeLv") String codeLv);

}
