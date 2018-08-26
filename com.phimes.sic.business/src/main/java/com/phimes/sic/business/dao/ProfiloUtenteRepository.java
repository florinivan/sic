package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@org.springframework.stereotype.Repository

public interface ProfiloUtenteRepository {
	@Query("select ut.nomeUtente, role, area from Utente ut join Ruolo role join Area area where ut.username = :username")
	Stream getProfiloUtenteBy (@Param ("username") String username );

}
