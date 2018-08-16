package com.phimes.sic.business.model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name = "PRF_LIVELLO")

public class Livello {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_LIV_SEQ")
    @SequenceGenerator(sequenceName = "prf_livello_seq", initialValue = 1, allocationSize = 1, name = "PRF_LIV_SEQ")

	@Column(name = "ID_LIVELLO")
	@Id
	private Long idLivello;

	@Column(name = "CODICE")
	private String codice;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@Column(name = "ORDINE")
	private Integer ordine;

	@Column(name = "TS_CREAZIONE")
	private Timestamp tsCreazione;

	@Column(name = "UT_CREAZIONE")
	private String utCreazione;

	@Column(name = "TS_MODIFICA")
	private Timestamp tsModifica;

	@Column(name = "UT_MODIFICA")
	private String utModifica;

	public Long getIdLivello() {
		return idLivello;
	}

	public void setIdLivello(Long idLivello) {
		this.idLivello = idLivello;
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

	public long getOrdine() {
		return ordine;
	}

	public void setOrdine(Integer ordine) {
		this.ordine = ordine;
	}

	public Timestamp getTs_Creazione() {
		return tsCreazione;
	}

	public void setTs_Creazione(Timestamp ts_Creazione) {
		this.tsCreazione = ts_Creazione;
	}

	public String getUt_Creazione() {
		return utCreazione;
	}

	public void setUt_Creazione(String ut_Creazione) {
		this.utCreazione = ut_Creazione;
	}

	public Timestamp getTs_Modifica() {
		return tsModifica;
	}

	public void setTs_Modifica(Timestamp ts_Modifica) {
		this.tsModifica = ts_Modifica;
	}

	public String getUt_Modifica() {
		return utModifica;
	}

	public void setUt_Modifica(String ut_Modifica) {
		this.utModifica = ut_Modifica;
	}

}
