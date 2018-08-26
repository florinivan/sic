package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.ParametroRepository;
import com.phimes.sic.business.model.Parametro;

@org.springframework.stereotype.Service
public class ParametroService extends Service<Parametro, String> {

	@Autowired
	private ParametroRepository rep;

	@Override
	protected CrudRepository<Parametro, String> getCrudRep() {

		return rep;
	}

}
