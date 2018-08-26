package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.LevelRepository;
import com.phimes.sic.business.dto.LevelDto;

@org.springframework.stereotype.Service
public class LevelService extends Service<LevelDto, Long> {

	@Autowired
	private LevelRepository rep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

}
