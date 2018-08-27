package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_USER")
@SequenceGenerator(sequenceName = "prf_user_seq", initialValue = 1, allocationSize = 1, name = "PRF_USE_SEQ")
public class User {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_USE_SEQ")
	
	@ManyToOne
	@JoinColumn(name = "ID_STATE")
	private State state;

	@ManyToMany(mappedBy = "users")
	private Set<Area> areas = new HashSet<>();

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_user_role", joinColumns = @JoinColumn(name = "id_user"), inverseJoinColumns = @JoinColumn(name = "id_ruolo"))
	private Set<Role> roles = new HashSet<>();

	@Column(name = "ID_USER")
	@Id
	private Long idUser;

	@Column(name = "USERNAME")
	private String username;

	@Column(name = "DOMAIN_CODE")
	private String domainCode;

	@Column(name = "TS_CREATION")
	private Timestamp tsCreation;

	@Column(name = "UT_CREATION")
	private String utCreation;

	@Column(name = "TS_MODIFY")
	private Timestamp tsModify;

	@Column(name = "UT_MODIFY")
	private String utModify;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDomainCode() {
		return domainCode;
	}

	public void setDomainCode(String domainCode) {
		this.domainCode = domainCode;
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
