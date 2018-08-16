package com.phimes.sic.business.model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "PRF_RUOLO")
public class Ruolo {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_RUO_SEQ")
    @SequenceGenerator(sequenceName = "prf_ruolo_seq", initialValue = 1, allocationSize = 1, name = "PRF_RUO_SEQ")

	@Column(name = "ID_RUOLO")
	@Id
	private Long idRuolo;

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

	public Long getIdRuolo() {
		return idRuolo;
	}

	public void setIdRuolo(Long idRuolo) {
		this.idRuolo = idRuolo;
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
