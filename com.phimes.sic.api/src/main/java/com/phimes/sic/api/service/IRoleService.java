package com.phimes.sic.api.service;

import com.phimes.sic.api.dto.RoleDto;

public interface IRoleService {
	
	//public List<RoleDto> getRoleDto(String idUser);
	public RoleDto getFilterDto(String codeApp, String codeUsr, String codeRl);

}
