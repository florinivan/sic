package com.phimes.sic.api.dto;

import java.util.Set;

import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.dto.MenuDto;

public class RoleDto {

	private Long serialVersionUID;

	private String code;

	private String description;

	private Set<FunctionDto> functions;

	private Set<MenuDto> menu;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescrizione(String description) {
		this.description = description;
	}

	public Set<FunctionDto> getFunctions() {
		return functions;
	}

	public void setFunzioni(Set<FunctionDto> functions) {
		this.functions = functions;
	}

	public Set<MenuDto> getMenu() {
		return menu;
	}

	public void setMenu(Set<MenuDto> menu) {
		this.menu = menu;
	}

}
