package com.phimes.sic.business.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.phimes.sic.business.model.Area;

@org.springframework.stereotype.Repository

public interface AreaRepository extends CrudRepository<Area, Long> {
	
	@Query("select a from  User usr join Area a join Application app join State st where usr.idUser = :codeUsr and app.code = :codeApp and a.code = :codeAr and st.idState = :idStateSt ")
	Area findOne(@Param("codeUsr") String codeUsr, @Param("codeApp") String codeApp, @Param("codeAr") String codeAr, @Param("idStateSt") Character idStateSt);




}
