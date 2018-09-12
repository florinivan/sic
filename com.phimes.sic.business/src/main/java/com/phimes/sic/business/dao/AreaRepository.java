package com.phimes.sic.business.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Area;

@org.springframework.stereotype.Repository

public interface AreaRepository extends CrudRepository<Area, Long> {
	
	@Query("select ar.area, ar.code, ar.description from Area ar join Application app join User usr join State st where usr.code =: codeUsr and app.code =: codeApp and ar.code =: codeAr and st.idState =: idStateSt ")
	Area findOne(@Param("codeUsr") String codeUsr, @Param("codeApp") String codeApp, @Param("codeAr") String codeAr, @Param("idStateSt") Character idStateSt);




}
