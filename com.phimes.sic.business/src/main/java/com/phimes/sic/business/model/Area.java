package com.phimes.sic.business.model;

import javax.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "PRF_AREA")
public class Area {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_ARE_SEQ")
    @SequenceGenerator(sequenceName = "prf_area_seq", initialValue = 1, allocationSize = 1, name = "PRF_ARE_SEQ")
	
	@Column(name = "ID_AREA")
	@Id
	private Long idArea;

	@Column(name = "ID_STATO")
	private char idStato;

	@Column(name = "CODICE")
	private String codice;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@Column(name = "TS_CREAZIONE")
	private Timestamp tsCreazione;

	@Column(name = "UT_CREAZIONE")
	private String utCreazione;

	@Column(name = "TS_MODIFICA")
	private Timestamp tsModifica;

	@Column(name = "UT_MODIFICA")
	private String utModifica;
	

	public Long getIdArea() {
		return idArea;
	}

	public void setIdArea(Long idArea) {
		this.idArea = idArea;
	}

	public char getIdStato() {
		return idStato;
	}

	public void setIdStato(char idStato) {
		this.idStato = idStato;
	}

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

	public Timestamp getTsCreazione() {
		return tsCreazione;
	}

	public void setTsCreazione(Timestamp tsCreazione) {
		this.tsCreazione = tsCreazione;
	}

	public String getUtCreazione() {
		return utCreazione;
	}

	public void setUtCreazione(String utCreazione) {
		this.utCreazione = utCreazione;
	}

	public Timestamp getTsModifica() {
		return tsModifica;
	}

	public void setTsModifica(Timestamp tsModifica) {
		this.tsModifica = tsModifica;
	}

	public String getUtModifica() {
		return utModifica;
	}

	public void setUtModifica(String utModifica) {
		this.utModifica = utModifica;
	}

	

}
