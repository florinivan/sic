package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Ruolo;

@org.springframework.stereotype.Repository

public interface RuoloRepository  extends CrudRepository<Ruolo, Long> {
	
	@Query("select rl.codice, rl.descrizione, fz, mn from Ruolo rl join Funzione fz join Menu mn")
	Stream getFunzioneMenu();

}