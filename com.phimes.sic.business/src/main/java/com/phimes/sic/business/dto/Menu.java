package com.phimes.sic.business.dto;

import java.util.Set;

public class Menu {

	private Long serialVersionUID;

	private String codice;

	private String descrizione;

	private String url;

	private int ordine;

	private Set<Menu> subMenu;

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getOrdine() {
		return ordine;
	}

	public void setOrdine(int ordine) {
		this.ordine = ordine;
	}

	public Set<Menu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(Set<Menu> subMenu) {
		this.subMenu = subMenu;
	}

}