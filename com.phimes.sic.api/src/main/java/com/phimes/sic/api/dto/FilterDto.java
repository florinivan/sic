package com.phimes.sic.api.dto;

import com.phimes.sic.api.dto.LevelDto;

public class FilterDto {

	private Long serialVersionUID;

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
