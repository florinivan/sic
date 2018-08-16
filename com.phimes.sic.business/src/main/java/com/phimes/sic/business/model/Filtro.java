package com.phimes.sic.business.model;

import javax.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="PRF_FILTRO")

public class Filtro {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_FIL_SEQ")
    @SequenceGenerator(sequenceName = "prf_filtro_seq", initialValue = 1, allocationSize = 1, name = "PRF_FIL_SEQ")
	
	@Column(name = "ID_FILTRO")
	@Id
	private Long idFiltro;
	
	@Column(name = "CODICE")
	private String codice;
	
	@Column(name = "DESCRIZIONE")
	private String descrizione;
	
	@Column(name = "DESCRIZIONE_LUNGA")
	private String descrizioneLunga;
	
	@Column(name = "TS_CREAZIONE")
	private Timestamp tsCreazione;
	
	@Column(name = "UT_CREAZIONE")
	private String utCreazione;
	
	@Column(name = "TS_MODIFICA")
	private Timestamp tsModifica;
	
	@Column(name = "UT_MOFICA")
	private String utModifica;

	public Long getIdFiltro() {
		return idFiltro;
	}

	public void setIdFiltro(Long idFiltro) {
		this.idFiltro = idFiltro;
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

	public String getDescrizioneLunga() {
		return descrizioneLunga;
	}

	public void setDescrizioneLunga(String descrizioneLunga) {
		this.descrizioneLunga = descrizioneLunga;
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
