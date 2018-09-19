package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.RoleDto;

public interface IRoleService {

	public List<RoleDto> getRoleListDto(String codeApp, String codeUsr, Character idStateRl);

	public RoleDto getFilterDto(String codeApp, String codeUsr, String codeRl, Character idStateRl);

}
