package com.phimes.sic.business.dto;

import java.util.Set;

import com.phimes.sic.business.model.Accesso;

public class Funzione {

	private Long serialVersionUID;

	private String codice;

	private String descrizione;

	private Set<Accesso> accessi;

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

	public Set<Accesso> getAccessi() {
		return accessi;
	}

	public void setAccessi(Set<Accesso> accessi) {
		this.accessi = accessi;
	}

}
