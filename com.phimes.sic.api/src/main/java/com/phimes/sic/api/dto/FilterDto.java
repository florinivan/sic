package com.phimes.sic.api.dto;

import java.io.Serializable;

import com.phimes.sic.api.dto.LevelDto;

public class FilterDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8385131801811489568L;

	private String code;

	private String description;

	private String longDescription;

	private LevelDto level;

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

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public LevelDto getLevel() {
		return level;
	}

	public void setLevel(LevelDto level) {
		this.level = level;
	}

}
