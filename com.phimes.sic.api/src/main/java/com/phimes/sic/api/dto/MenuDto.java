package com.phimes.sic.api.dto;

import java.util.Set;

public class MenuDto {

	private Long serialVersionUID;

	private String code;

	private String description;

	private String url;

	private int order;

	private Set<MenuDto> subMenu;

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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public Set<MenuDto> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(Set<MenuDto> subMenu) {
		this.subMenu = subMenu;
	}

}