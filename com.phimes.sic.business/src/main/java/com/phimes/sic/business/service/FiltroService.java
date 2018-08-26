package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessoRepository;
import com.phimes.sic.business.dao.FiltroRepository;
import com.phimes.sic.business.dto.Filtro;

@org.springframework.stereotype.Service
public class FiltroService extends Service<Filtro, Long> {

	@Autowired
	private FiltroRepository rep;
	
	@Override
	protected CrudRepository getCrudRep() {
		
		return rep;
	}

}
