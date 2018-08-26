package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessoRepository;
import com.phimes.sic.business.dao.FunzioneRepository;
import com.phimes.sic.business.dto.Funzione;

@org.springframework.stereotype.Service
public class FunzioneService extends Service<Funzione, Long> {

	@Autowired
	private FunzioneRepository rep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

}
