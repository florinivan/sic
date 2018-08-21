package com.phimes.sic.business.model;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "PRF_PARAMETRO")
public class Parametro {

	@ManyToOne
	@JoinColumn(name = "ID_APPLICAZIONE")
	private Applicazione applicazione;

	@Column(name = "ID_PARAMETRO")
	@Id
	private String idParametro;

	@Column(name = "VALORE")
	private String valore;

	@Column(name = "TS_CREAZIONE")
	private Timestamp tsCreazione;

	@Column(name = "UT_CREAZIONE")
	private String utCreazione;

	@Column(name = "TS_MODIFICA")
	private Timestamp tsModifica;

	@Column(name = "UT_MODIFICA")
	private String utMODIFICA;

	public Applicazione getApplicazione() {
		return applicazione;
	}

	public void setApplicazione(Applicazione applicazione) {
		this.applicazione = applicazione;
	}

	public String getIdParametro() {
		return idParametro;
	}

	public void setIdParametro(String idParametro) {
		this.idParametro = idParametro;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
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

	public String getUtMODIFICA() {
		return utMODIFICA;
	}

	public void setUtMODIFICA(String utMODIFICA) {
		this.utMODIFICA = utMODIFICA;
	}

}
