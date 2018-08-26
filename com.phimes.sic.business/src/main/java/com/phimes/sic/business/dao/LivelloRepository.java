package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Livello;

@org.springframework.stereotype.Repository

public interface LivelloRepository extends CrudRepository<Livello, Long> {
	
	@Query("select lv.codice, lv.descrizione, lv.ordine from Livello lv join Filtro fl")
	Stream getLivelloFiltro();

}
