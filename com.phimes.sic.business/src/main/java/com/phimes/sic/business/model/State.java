package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_STATE")

public class State {

	@OneToMany(mappedBy = "state")
	private Set<Area> areas;

	@OneToMany(mappedBy = "state")
	private Set<Role> roles;

	@OneToMany(mappedBy = "state")
	private Set<Application> application;

	@OneToMany(mappedBy = "state")
	private Set<User> users;

	@Column(name = "ID_STATE")
	@Id
	private Character idState;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "STATE_ORDER")
	private Integer stateOrder;

	@Column(name = "CREATE_TS")
	private Timestamp createTs;

	@Column(name = "CREATE_UT")
	private String createUt;

	@Column(name = "MODIFY_TS")
	private Timestamp modifyTs;

	@Column(name = "MODIFY_UT")
	private String modifyUt;

	public Character getIdState() {
		return idState;
	}

	public void setIdState(Character idState) {
		this.idState = idState;
	}
	
	public Set<Area> getAreas() {
		return areas;
	}

	public void setAreas(Set<Area> areas) {
		this.areas = areas;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Application> getApplication() {
		return application;
	}

	public void setApplication(Set<Application> application) {
		this.application = application;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStateOrder() {
		return stateOrder;
	}

	public void setStateOrder(Integer stateOrder) {
		this.stateOrder = stateOrder;
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
