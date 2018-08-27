package com.phimes.sic.business.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.RoleRepository;
import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.service.IRoleService;
import com.phimes.sic.business.model.Filter;
import com.phimes.sic.business.model.Role;

@org.springframework.stereotype.Service
public class RoleService extends Service<RoleDto, Long> implements IRoleService {

	@Autowired
	private RoleRepository rep;

	@Override
	protected CrudRepository getCrudRep() {

		return rep;
	}
	
	ModelMapper modelMapper = new ModelMapper();
	
	public RoleDto getRoleDto() {
		Role role = rep.getFunctionMenu();
		RoleDto roleSer = modelMapper.map(role, RoleDto.class);
		return roleSer;
	}
}
