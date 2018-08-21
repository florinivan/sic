package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_APPLICAZIONE")
public class Applicazione {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_APP_SEQ")
	@SequenceGenerator(sequenceName = "prf_applicazione_seq", initialValue = 1, allocationSize = 1, name = "PRF_APP_SEQ")

	@ManyToOne
	@JoinColumn(name = "ID_STATO")
	private Stato stato;

	@OneToMany(mappedBy = "applicazione")
	private Set<Livello> livelli;

	@OneToMany(mappedBy = "applicazione")
	private Set<Parametro> parametri;

	@OneToMany(mappedBy = "applicazione")
	private Set<Ruolo> ruoli;

	@OneToMany(mappedBy = "applicazione")
	private Set<Funzione> funzioni;

	@OneToMany(mappedBy = "applicazione")
	private Set<Menu> menu;

	@OneToMany(mappedBy = "applicazione")
	private Set<Area> aree;

	@Column(name = "ID_APPLICAZIONE")
	@Id
	private Long idApplicazione;

	@Column(name = "ID_STATO")
	private char idStato;

	@Column(name = "CODICE")
	private String codice;

	@Column(name = "DESCRIZIONE")
	private String descrizione;

	@Column(name = "CODICE_DOMINIO")
	private String codiceDominio;

	@Column(name = "PROFILAZIONE_DATI")
	private char profilazioneDati;

	@Column(name = "SALTA_PROFILAZIONE")
	private char saltaProfilazione;

	@Column(name = "TS_CREAZIONE")
	private Timestamp tsCreazione;

	@Column(name = "UT_CREAZIONE")
	private String utCreazione;

	@Column(name = "TS_MODIFICA")
	private Timestamp tsModifica;

	@Column(name = "UT_MODIFICA")
	private String utModifica;

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public Set<Livello> getLivelli() {
		return livelli;
	}

	public void setLivelli(Set<Livello> livelli) {
		this.livelli = livelli;
	}

	public Set<Parametro> getParametri() {
		return parametri;
	}

	public void setParametri(Set<Parametro> parametri) {
		this.parametri = parametri;
	}

	public Set<Ruolo> getRuoli() {
		return ruoli;
	}

	public void setRuoli(Set<Ruolo> ruoli) {
		this.ruoli = ruoli;
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

	public Set<Area> getAree() {
		return aree;
	}

	public void setAree(Set<Area> aree) {
		this.aree = aree;
	}

	public Long getIdApplicazione() {
		return idApplicazione;
	}

	public void setIdApplicazione(Long idApplicazione) {
		this.idApplicazione = idApplicazione;
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

	public String getCodiceDominio() {
		return codiceDominio;
	}

	public void setCodiceDominio(String codiceDominio) {
		this.codiceDominio = codiceDominio;
	}

	public char getProfilazioneDati() {
		return profilazioneDati;
	}

	public void setProfilazioneDati(char profilazioneDati) {
		this.profilazioneDati = profilazioneDati;
	}

	public char getSaltaProfilazione() {
		return saltaProfilazione;
	}

	public void setSaltaProfilazione(char saltaProfilazione) {
		this.saltaProfilazione = saltaProfilazione;
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
