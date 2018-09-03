package com.phimes.sic.api.dto;

import java.io.Serializable;
import java.util.Set;

import com.phimes.sic.api.dto.FilterDto;

public class AreaDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6974789935467679696L;

	private String code;

	private String description;

	private Set<FilterDto> filter;

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

	public Set<FilterDto> getFilter() {
		return filter;
	}

	public void setFilter(Set<FilterDto> filter) {
		this.filter = filter;
	}

}
