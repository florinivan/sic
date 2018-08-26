package com.phimes.sic.business.dto;

import java.util.Set;

import com.phimes.sic.business.dto.AccessDto;

public class FunctionDto {

	private Long serialVersionUID;

	private String code;

	private String description;

	private Set<AccessDto> accesses;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<AccessDto> getAccesses() {
		return accesses;
	}

	public void setAccesses(Set<AccessDto> accesses) {
		this.accesses = accesses;
	}

}
