package com.phimes.sic.api.dto;

import java.io.Serializable;

public class AccessDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5668859211653885992L;

	private String code;

	private String description;

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

}
