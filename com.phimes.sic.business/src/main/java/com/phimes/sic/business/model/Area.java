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

	@Column(name = "CREATE_TS")
	private Timestamp createTs;

	@Column(name = "CREATE_UT")
	private String createUt;

	@Column(name = "MODIFY_TS")
	private Timestamp modifyTs;

	@Column(name = "MODIFY_UT")
	private String modifyUt;

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

	public Timestamp getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Timestamp createTs) {
		this.createTs = createTs;
	}

	public String getCreateUt() {
		return createUt;
	}

	public void setCreateUt(String createUt) {
		this.createUt = createUt;
	}

	public Timestamp getModifyTs() {
		return modifyTs;
	}

	public void setModifyTs(Timestamp modifyTs) {
		this.modifyTs = modifyTs;
	}

	public String getModifyUt() {
		return modifyUt;
	}

	public void setModifyUt(String modifyUt) {
		this.modifyUt = modifyUt;
	}

	}
