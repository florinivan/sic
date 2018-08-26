package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.ParameterRepository;
import com.phimes.sic.business.model.Parameter;

@org.springframework.stereotype.Service
public class ParameterService extends Service<Parameter, String> {

	@Autowired
	private ParameterRepository rep;

	@Override
	protected CrudRepository<Parameter, String> getCrudRep() {

		return rep;
	}

}
