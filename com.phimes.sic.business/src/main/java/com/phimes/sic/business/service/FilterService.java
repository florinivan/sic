package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.FilterRepository;
import com.phimes.sic.business.dto.FilterDto;

@org.springframework.stereotype.Service
public class FilterService extends Service<FilterDto, Long> {

	@Autowired
	private FilterRepository rep;
	
	@Override
	protected CrudRepository getCrudRep() {
		
		return rep;
	}

}
