package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessoRepository;
import com.phimes.sic.business.dao.LivelloRepository;
import com.phimes.sic.business.dto.Livello;

@org.springframework.stereotype.Service
public class LivelloService extends Service<Livello, Long> {

	@Autowired
	private LivelloRepository rep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

}
