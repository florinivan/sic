package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Accesso;

@org.springframework.stereotype.Repository
public interface AccessoRepository extends CrudRepository<Accesso, Character> {

	@Query("select acc.codice, acc.descrizione from Accesso acc join Funzione fz")
	Stream getAccessoFunzione();

}
