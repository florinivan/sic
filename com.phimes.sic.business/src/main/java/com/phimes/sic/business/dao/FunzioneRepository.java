package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Funzione;

@org.springframework.stereotype.Repository

public interface FunzioneRepository extends CrudRepository<Funzione, Long> {
	
	@Query("select fz.codice, fz.descrizione, fz.accessi from Funzione fz join Accesso acc")
	Stream getFunzioneAccesso();

}
