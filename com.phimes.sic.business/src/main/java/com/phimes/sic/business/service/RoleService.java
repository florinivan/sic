package com.phimes.sic.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.service.IRoleService;
import com.phimes.sic.business.dao.RoleRepository;
import com.phimes.sic.business.model.Role;

@org.springframework.stereotype.Service
@Component
public class RoleService extends Service<Role, Long> implements IRoleService {

	@Autowired
	private RoleRepository rep;

	@Override
	protected CrudRepository getCrudRep() {

		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public List<RoleDto> getRoleListDto(String codeApp, String codeUsr, Character idStateRl) {
		Set<Role> role = rep.getRoleList(codeApp, codeUsr, idStateRl);
		List<RoleDto> dtos = new ArrayList<RoleDto>();
		for (Role item : role) {
			RoleDto roleSer = modelMapper.map(item, RoleDto.class);
			dtos.add(roleSer);
		}

		return dtos;

	}

	public RoleDto getFilterDto(String codeApp, String codeUsr, String codeRl, Character idStateRl) {
		List<RoleDto> roles = getRoleListDto(codeApp, codeUsr, idStateRl);
		RoleDto roleSer = null;
		for (RoleDto roleDto : roles) {
			if (roleDto.getCode() == codeRl)
				roleSer = roleDto;

		}

		return roleSer;
	}
}
