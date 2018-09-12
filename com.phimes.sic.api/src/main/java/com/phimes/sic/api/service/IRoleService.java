package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.RoleDto;

public interface IRoleService {
	
	//public List<RoleDto> getRoleDto(String idUser);
	public RoleDto getFilterDto(String codeApp, String codeMn, String codeFz, String codeUsr, String codeRl);

}
