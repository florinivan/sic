package com.phimes.sic.api.dto;

import java.io.Serializable;
import java.util.Map;

import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.api.dto.RoleDto;

public class UserProfileDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String username;

	private Map<String, String> personalDataMap;

	private RoleDto role;

	private AreaDto area;

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
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
