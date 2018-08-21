package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_MENU")
public class Menu {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_MENU_SEQ")
	@SequenceGenerator(sequenceName = "prf_menu_seq", initialValue = 1, allocationSize = 1, name = "PRF_MENU_SEQ")

	@ManyToMany(mappedBy = "menu")
	private Set<Ruolo> ruolo = new HashSet<>();

	/*
	 * @OneToMany(mappedBy = "menu") private Set<Menu> menu= new HashSet<>();
	 */

	@ManyToOne
	@JoinColumn(name = "ID_APPLICAZIONE")
	private Applicazione applicazione;

	@Column(name = "ID_MENU")
	@Id
	private Long idUtente;

	@Column(name = "CODICE")
	private String codice;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@Column(name = "URL")
	private String url;

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

	public Set<Ruolo> getRuolo() {
		return ruolo;
	}

	public void setRuolo(Set<Ruolo> ruolo) {
		this.ruolo = ruolo;
	}

	public Applicazione getApplicazione() {
		return applicazione;
	}

	public void setApplicazione(Applicazione applicazione) {
		this.applicazione = applicazione;
	}

	public Long getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getOrdine() {
		return ordine;
	}

	public void setOrdine(Integer ordine) {
		this.ordine = ordine;
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
