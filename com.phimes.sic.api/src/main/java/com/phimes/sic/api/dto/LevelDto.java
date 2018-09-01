package com.phimes.sic.api.dto;

import java.io.Serializable;

public class LevelDto implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -312310818937903107L;

	private String code;

	private String description;

	private int order;

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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	
}
