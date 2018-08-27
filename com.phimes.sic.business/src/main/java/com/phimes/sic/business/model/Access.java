package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_ACCESS")

public class Access {

	@ManyToMany(mappedBy = "accesses")
	private Set<Function> functions = new HashSet<>();

	@Column(name = "ID_ACCESS")
	@Id
	private Character idAccess;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "ORDER")
	private Integer order;

	@Column(name = "TS_CREATION")
	private Timestamp tsCreation;

	@Column(name = "UT_CREATION")
	private String utCreazione;

	@Column(name = "TS_MODIFY")
	private Timestamp tsModify;
	

	public Character getIdAccess() {
		return idAccess;
	}

	public void setIdAccess(Character idAccess) {
		this.idAccess = idAccess;
	}

	public Set<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(Set<Function> functions) {
		this.functions = functions;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Timestamp getTsCreation() {
		return tsCreation;
	}

	public void setTsCreation(Timestamp tsCreation) {
		this.tsCreation = tsCreation;
	}

	public String getUtCreazione() {
		return utCreazione;
	}

	public void setUtCreazione(String utCreazione) {
		this.utCreazione = utCreazione;
	}

	public Timestamp getTsModify() {
		return tsModify;
	}

	public void setTsModify(Timestamp tsModify) {
		this.tsModify = tsModify;
	}

	public String getUtModify() {
		return utModify;
	}

	public void setUtModify(String utModify) {
		this.utModify = utModify;
	}

	@Column(name = "UT_MODIFY")
	private String utModify;

	
	}

	
