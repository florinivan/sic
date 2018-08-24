package com.phimes.sic.business.dto;

import java.util.Set;

import com.phimes.sic.business.model.Funzione;
import com.phimes.sic.business.model.Menu;

public class Ruolo {

	private Long serialVersionUID;

	private String codice;

	private String descrizione;

	private Set<Funzione> funzioni;

	private Set<Menu> menu;

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

	public Set<Funzione> getFunzioni() {
		return funzioni;
	}

	public void setFunzioni(Set<Funzione> funzioni) {
		this.funzioni = funzioni;
	}

	public Set<Menu> getMenu() {
		return menu;
	}

	public void setMenu(Set<Menu> menu) {
		this.menu = menu;
	}

}
