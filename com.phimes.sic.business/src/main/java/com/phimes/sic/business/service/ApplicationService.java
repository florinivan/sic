package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.ApplicationRepository;
import com.phimes.sic.business.model.Application;


@org.springframework.stereotype.Service
public class ApplicationService extends Service<Application, Long> {

	@Autowired
	private ApplicationRepository rep;
	
	@Override
	protected CrudRepository<Application, Long> getCrudRep() {
		
		return rep;
	}

}
