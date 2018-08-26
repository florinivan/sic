package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.AreaRepository;
import com.phimes.sic.business.dto.AreaDto;



@org.springframework.stereotype.Service
public class AreaService extends Service<AreaDto, Long> {

	@Autowired
	private AreaRepository rep;
	
	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

}
