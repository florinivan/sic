package com.phimes.sic.api.dto;

import java.io.Serializable;

public class AccessDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5668859211653885992L;

	private String idAccess;

	private String description;

	public String getIdAccess() {
		return idAccess;
	}

	public void setIdAccess(String idAccess) {
		this.idAccess = idAccess;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
