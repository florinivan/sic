package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.MenuDto;

public interface IMenuService {
	public List<MenuDto> getMenuDto(String codeRl, String codeApp, Long idSubMenu);

}
