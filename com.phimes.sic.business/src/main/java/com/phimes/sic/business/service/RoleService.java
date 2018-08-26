package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.RoleRepository;
import com.phimes.sic.business.dto.RoleDto;

@org.springframework.stereotype.Service
public class RoleService extends Service<RoleDto, Long> {

	@Autowired
	private RoleRepository rep;

	@Override
	protected CrudRepository getCrudRep() {

		return rep;
	}

}
