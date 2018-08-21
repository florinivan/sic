package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_FUNZIONE")
public class Funzione {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_FUN_SEQ")
	@SequenceGenerator(sequenceName = "prf_funzione_seq", initialValue = 1, allocationSize = 1, name = "PRF_FUN_SEQ")

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_funzione_accesso", joinColumns = @JoinColumn(name = "id_funzione"), inverseJoinColumns = @JoinColumn(name = "id_accesso"))
	private Set<Accesso> accessi = new HashSet<>();

	@ManyToMany(mappedBy = "funzioni")
	private Set<Ruolo> ruoli = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "ID_APPLICAZIONE")
	private Applicazione applicazione;

	@Column(name = "ID_FUNZIONE")
	@Id
	private Long idFunzione;

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

	public Set<Accesso> getAccessi() {
		return accessi;
	}

	public void setAccessi(Set<Accesso> accessi) {
		this.accessi = accessi;
	}

	public Set<Ruolo> getRuoli() {
		return ruoli;
	}

	public void setRuoli(Set<Ruolo> ruoli) {
		this.ruoli = ruoli;
	}

	public Applicazione getApplicazione() {
		return applicazione;
	}

	public void setApplicazione(Applicazione applicazione) {
		this.applicazione = applicazione;
	}

	public Long getIdFunzione() {
		return idFunzione;
	}

	public void setIdFunzione(Long idFunzione) {
		this.idFunzione = idFunzione;
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
