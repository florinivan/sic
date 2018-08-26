package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.RuoloRepository;
import com.phimes.sic.business.dto.Ruolo;

@org.springframework.stereotype.Service
public class RuoloService extends Service<Ruolo, Long> {

	@Autowired
	private RuoloRepository rep;

	@Override
	protected CrudRepository getCrudRep() {

		return rep;
	}

}
