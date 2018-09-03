package com.phimes.sic.business.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.RoleRepository;
import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.service.IRoleService;
import com.phimes.sic.business.model.Filter;
import com.phimes.sic.business.model.Role;

@org.springframework.stereotype.Component
public class RoleService extends Service<RoleDto, Long> implements IRoleService {

	@Autowired
	private RoleRepository rep;

	@Override
	protected CrudRepository getCrudRep() {

		return rep;
	}
	
	ModelMapper modelMapper = new ModelMapper();
	
	public List<RoleDto> getRoleDto(String idUser) {
		List<Role> role = rep.getRoleList(idUser);
		List<RoleDto> dtos = new ArrayList<RoleDto>();
		for(Role item: role) {
			RoleDto roleSer = modelMapper.map(item, RoleDto.class);
			dtos.add(roleSer);
		}
		
		
		return dtos;
	}
}
