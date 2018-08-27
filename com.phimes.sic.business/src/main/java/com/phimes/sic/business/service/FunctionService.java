package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.FunctionRepository;

@org.springframework.stereotype.Service
public class FunctionService extends Service<FunctionDto, Long> {

	@Autowired
	private FunctionRepository rep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

}
