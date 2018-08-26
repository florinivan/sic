package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.model.Access;




@org.springframework.stereotype.Service
public class AccessService extends Service<Access, Character> {

	@Autowired
	private AccessRepository rep;

	@Override
	protected CrudRepository<Access, Character> getCrudRep() {
		return rep;
	}

}
