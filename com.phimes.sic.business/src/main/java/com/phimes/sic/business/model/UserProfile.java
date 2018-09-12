package com.phimes.sic.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_PROFILE")
public class UserProfile {
	@Id
	@Column(name = "USERNAME")
	private String username;
	
	@Column (name = "ID_USER")
	private Long idUser;
	
	@Column (name = "ID_ROLE")
	private Long idRole;
	
	@Column (name= "CODE")
	private String code;
	
	@Column (name= "DESCRIPTION")
	private String description;
	
	@Column (name= "AREA_CODE")
	private String areaCode;
	
	@Column (name= "AREA_DESCRIPTION")
	private String areaDescription;
	
	@Column (name= "ID_AREA")
	private Long idArea;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

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

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaDescription() {
		return areaDescription;
	}

	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}

	public Long getIdArea() {
		return idArea;
	}

	public void setIdArea(Long idArea) {
		this.idArea = idArea;
	}
	
	
	
	
	
	

}
