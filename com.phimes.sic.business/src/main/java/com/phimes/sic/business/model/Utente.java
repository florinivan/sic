package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_UTENTE")
public class Utente {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_UTE_SEQ")
	@SequenceGenerator(sequenceName = "prf_utente_seq", initialValue = 1, allocationSize = 1, name = "PRF_UTE_SEQ")

	@ManyToOne
	@JoinColumn(name = "ID_STATO")
	private Stato stato;

	@ManyToMany(mappedBy = "utenti")
	private Set<Area> aree = new HashSet<>();

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_utente_ruolo", joinColumns = @JoinColumn(name = "id_utente"), inverseJoinColumns = @JoinColumn(name = "id_ruolo"))
	private Set<Ruolo> ruoli = new HashSet<>();

	@Column(name = "ID_UTENTE")
	@Id
	private Long idUtente;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "CODICE_DOMINIO")
	private String codiceDominio;

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

	public Set<Ruolo> getRuoli() {
		return ruoli;
	}

	public void setRuoli(Set<Ruolo> ruoli) {
		this.ruoli = ruoli;
	}

	public Set<Area> getAree() {
		return aree;
	}

	public void setAree(Set<Area> aree) {
		this.aree = aree;
	}

	public Long getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Long idUtente) {
		this.idUtente = idUtente;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCodiceDominio() {
		return codiceDominio;
	}

	public void setCodiceDominio(String codiceDominio) {
		this.codiceDominio = codiceDominio;
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
