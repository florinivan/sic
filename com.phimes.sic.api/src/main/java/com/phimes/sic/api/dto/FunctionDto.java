package com.phimes.sic.api.dto;

import java.io.Serializable;
import java.util.Set;

import com.phimes.sic.api.dto.AccessDto;

public class FunctionDto implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -1404707890622185024L;

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
