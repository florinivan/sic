package com.phimes.sic.business.dto;

import java.util.Set;

import com.phimes.sic.business.model.Filtro;

public class Area {

	private Long serialVersionUID;

	private String codice;

	private String descrizione;

	private Set<Filtro> filtri;
	
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

	public Set<Filtro> getFiltri() {
		return filtri;
	}

	public void setFiltri(Set<Filtro> filtri) {
		this.filtri = filtri;
	}

	
}
