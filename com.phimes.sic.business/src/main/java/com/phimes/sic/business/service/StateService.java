package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.StateRepository;
import com.phimes.sic.business.model.State;

@org.springframework.stereotype.Service
public class StateService extends Service<State, Character> {

	@Autowired
	private StateRepository rep;
	
	@Override
	protected CrudRepository<State, Character> getCrudRep() {
		
		return rep;
	}

}
