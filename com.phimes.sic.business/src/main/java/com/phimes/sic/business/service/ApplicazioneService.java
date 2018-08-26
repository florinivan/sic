package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.ApplicazioneRepository;
import com.phimes.sic.business.model.Applicazione;


@org.springframework.stereotype.Service
public class ApplicazioneService extends Service<Applicazione, Long> {

	@Autowired
	private ApplicazioneRepository rep;
	
	@Override
	protected CrudRepository<Applicazione, Long> getCrudRep() {
		
		return rep;
	}

}
