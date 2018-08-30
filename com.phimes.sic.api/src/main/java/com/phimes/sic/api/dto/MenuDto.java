package com.phimes.sic.api.dto;

import java.util.Set;

public class MenuDto {

	private Long serialVersionUID;

	private String code;

	private String description;

	private String url;

	private int menuOrder;

	private Set<MenuDto> IdSubMenu;

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

	public Set<MenuDto> getIdSubMenu() {
		return IdSubMenu;
	}

	public void setIdSubMenu(Set<MenuDto> IdSubMenu) {
		this.IdSubMenu = IdSubMenu;
	}

}