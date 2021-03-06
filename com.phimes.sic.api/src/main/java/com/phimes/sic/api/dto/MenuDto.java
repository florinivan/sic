package com.phimes.sic.api.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class MenuDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6542972626640500478L;

	private String code;

	private String description;

	private String url;

	private int menuOrder;

	private List<MenuDto> idSubMenu;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(int menuOrder) {
		this.menuOrder = menuOrder;
	}

	public List<MenuDto> getIdSubMenu() {
		return idSubMenu;
	}

	public void setIdSubMenu(List<MenuDto> idSubMenu) {
		this.idSubMenu = idSubMenu;
	}

	
}