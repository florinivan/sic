package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessoRepository;
import com.phimes.sic.business.model.Accesso;




@org.springframework.stereotype.Service
public class AccessoService extends Service<Accesso, Character> {

	@Autowired
	private AccessoRepository rep;

	@Override
	protected CrudRepository<Accesso, Character> getCrudRep() {
		return rep;
	}

}
