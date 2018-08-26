package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.StatoRepository;
import com.phimes.sic.business.model.Stato;

@org.springframework.stereotype.Service
public class StatoService extends Service<Stato, Character> {

	@Autowired
	private StatoRepository rep;
	
	@Override
	protected CrudRepository<Stato, Character> getCrudRep() {
		
		return rep;
	}

}
