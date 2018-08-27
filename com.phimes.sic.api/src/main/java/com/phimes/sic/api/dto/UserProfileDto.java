package com.phimes.sic.api.dto;

import java.util.Map;

import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.api.dto.RoleDto;

public class UserProfileDto {

	private Long serialVersionUID;

	private String userName;

	private Map<String, String> personalDataMap;

	private RoleDto role;

	private AreaDto area;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<String, String> getPersonalDataMap() {
		return personalDataMap;
	}

	public void setPersonalDataMap(Map<String, String> personalDataMap) {
		this.personalDataMap = personalDataMap;
	}

	public RoleDto getRole() {
		return role;
	}

	public void setRole(RoleDto role) {
		this.role = role;
	}

	public AreaDto getArea() {
		return area;
	}

	public void setArea(AreaDto area) {
		this.area = area;
	}

}
