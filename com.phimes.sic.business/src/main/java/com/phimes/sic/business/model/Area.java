package com.phimes.sic.business.model;

import java.util.*;
import javax.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "PRF_AREA")
@SequenceGenerator(sequenceName = "prf_area_seq", initialValue = 1, allocationSize = 1, name = "PRF_ARE_SEQ")
public class Area {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_ARE_SEQ")
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_user_area", joinColumns = @JoinColumn(name = "id_area"), inverseJoinColumns = @JoinColumn(name = "id_user"))
	private Set<User> users = new HashSet<>();

	@ManyToMany(mappedBy = "areas")
	private Set<Filter> filters = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "ID_STATE", insertable = false, updatable = false)
	private State state;
    
	@ManyToOne
	@JoinColumn(name = "ID_APPLICATION")
	private Application application;
	
	@Column(name = "ID_AREA")
	@Id
	private Long idArea;

	@Column(name = "ID_STATE")
	private char idState;

	@Column(name = "CODE")
	private String code;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "TS_CREATION")
	private Timestamp tsCreation;

	@Column(name = "UT_CREATION")
	private String utCreation;

	@Column(name = "TS_MODIFY")
	private Timestamp tsModify;

	@Column(name = "UT_MODIFY")
	private String utModify;

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public Set<Filter> getFilters() {
		return filters;
	}

	public void setFilters(Set<Filter> filters) {
		this.filters = filters;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public char getIdState() {
		return idState;
	}

	public void setIdState(char idState) {
		this.idState = idState;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getTsCreation() {
		return tsCreation;
	}

	public void setTsCreation(Timestamp tsCreation) {
		this.tsCreation = tsCreation;
	}

	public String getUtCreation() {
		return utCreation;
	}

	public void setUtCreation(String utCreation) {
		this.utCreation = utCreation;
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

	}
