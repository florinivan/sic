package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessoRepository;
import com.phimes.sic.business.dao.AreaRepository;
import com.phimes.sic.business.dto.Area;



@org.springframework.stereotype.Service
public class AreaService extends Service<Area, Long> {

	@Autowired
	private AreaRepository rep;
	
	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

}
