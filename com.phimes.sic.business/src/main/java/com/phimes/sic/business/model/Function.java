package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_FUNCTION")
@SequenceGenerator(sequenceName = "prf_function_seq", initialValue = 1, allocationSize = 1, name = "PRF_FUN_SEQ")
public class Function {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_FUN_SEQ")
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_function_access", joinColumns = @JoinColumn(name = "id_function"), inverseJoinColumns = @JoinColumn(name = "id_access"))
	private Set<Access> accesses = new HashSet<>();

	@ManyToMany(mappedBy = "functions")
	private Set<Role> roles = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "ID_APPLICATION")
	private Application application;

	@Column(name = "ID_FUNCTION")
	@Id
	private Long idFunction;

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

	public Set<Access> getAccesses() {
		return accesses;
	}

	public void setAccesses(Set<Access> accesses) {
		this.accesses = accesses;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
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
