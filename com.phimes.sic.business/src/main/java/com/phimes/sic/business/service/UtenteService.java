package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.UtenteRepository;
import com.phimes.sic.business.model.Utente;

@org.springframework.stereotype.Service
public class UtenteService extends Service<Utente, Long> {

	@Autowired
	private UtenteRepository rep;

	@Override
	protected CrudRepository<Utente, Long> getCrudRep() {

		return rep;
	}

}
