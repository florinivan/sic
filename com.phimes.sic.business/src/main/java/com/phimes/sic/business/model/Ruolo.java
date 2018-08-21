package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_RUOLO")
public class Ruolo {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_RUO_SEQ")
	@SequenceGenerator(sequenceName = "prf_ruolo_seq", initialValue = 1, allocationSize = 1, name = "PRF_RUO_SEQ")

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_ruolo_menu", joinColumns = @JoinColumn(name = "id_ruolo"), inverseJoinColumns = @JoinColumn(name = "id_menu"))
	private Set<Menu> menu = new HashSet<>();

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_ruolo_funzione", joinColumns = @JoinColumn(name = "id_ruolo"), inverseJoinColumns = @JoinColumn(name = "id_funzione"))
	private Set<Funzione> funzioni = new HashSet<>();

	@ManyToMany(mappedBy = "ruoli")
	private Set<Utente> utenti = new HashSet<>();
    
	@ManyToOne
	@JoinColumn(name = "ID_STATO")
	private Stato stato;

	@ManyToOne
	@JoinColumn(name = "ID_APPLICAZIONE")
	private Applicazione applicazione;

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

	public Set<Menu> getMenu() {
		return menu;
	}

	public void setMenu(Set<Menu> menu) {
		this.menu = menu;
	}

	public Set<Funzione> getFunzioni() {
		return funzioni;
	}

	public void setFunzioni(Set<Funzione> funzioni) {
		this.funzioni = funzioni;
	}

	public Set<Utente> getUtenti() {
		return utenti;
	}

	public void setUtenti(Set<Utente> utenti) {
		this.utenti = utenti;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}

	public Applicazione getApplicazione() {
		return applicazione;
	}

	public void setApplicazione(Applicazione applicazione) {
		this.applicazione = applicazione;
	}

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
