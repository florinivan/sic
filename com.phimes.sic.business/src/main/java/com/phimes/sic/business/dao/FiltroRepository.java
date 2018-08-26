package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Filtro;

@org.springframework.stereotype.Repository

public interface FiltroRepository extends CrudRepository<Filtro, Long> {

	@Query("select fl.codice, fl.descrizione, fl.descrizioneLunga, lv from Filtro fl join Livello lv")
	Stream getFiltroLivello();
}
