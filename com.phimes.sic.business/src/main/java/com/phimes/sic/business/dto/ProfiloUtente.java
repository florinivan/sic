package com.phimes.sic.business.dto;

import java.util.Map;

import com.phimes.sic.business.dto.Area;
import com.phimes.sic.business.dto.Ruolo;

public class ProfiloUtente {

	private Long serialVersionUID;

	private String nomeUtente;

	private Map<String, String> personalDataMap;

	private Ruolo ruolo;

	private Area area;

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public Map<String, String> getPersonalDataMap() {
		return personalDataMap;
	}

	public void setPersonalDataMap(Map<String, String> personalDataMap) {
		this.personalDataMap = personalDataMap;
	}

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

}
