package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_APPLICATION")
@SequenceGenerator(sequenceName = "prf_application_seq", initialValue = 1, allocationSize = 1, name = "PRF_APP_SEQ")
public class Application {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_APP_SEQ")
	@Column(name = "ID_APPLICATION")
	@Id
	private Long idApplication;
	
	@ManyToOne
	@JoinColumn(name = "ID_STATE", insertable = false, updatable = false)
	private State state;

	@OneToMany(mappedBy = "application")
	private Set<Level> levels;

	@OneToMany(mappedBy = "application")
	private Set<Parameter> parameters;

	@OneToMany(mappedBy = "application")
	private Set<Role> roles;

	@OneToMany(mappedBy = "application")
	private Set<Function> functions;

	@OneToMany(mappedBy = "application")
	private Set<Menu> menu;

	@OneToMany(mappedBy = "application")
	private Set<Area> areas;

	@Column(name = "ID_STATE")
	private char idState;

	@Column(name = "CODE")
	private String code;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "DOMAIN_CODE")
	private String domainCode;

	@Column(name = "PROFILING_DATES")
	private char profilingDates;

	@Column(name = "JUMP_PROFILING")
	private char jumpProfiling;

	@Column(name = "CREATE_TS")
	private Timestamp createTs;

	@Column(name = "CREATE_UT")
	private String createUt;

	@Column(name = "MODIFY_TS")
	private Timestamp modifyTs;

	@Column(name = "MODIFY_UT")
	private String modifyUt;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Set<Level> getLevels() {
		return levels;
	}

	public void setLevels(Set<Level> levels) {
		this.levels = levels;
	}

	public Set<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(Set<Parameter> parameters) {
		this.parameters = parameters;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Set<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(Set<Function> functions) {
		this.functions = functions;
	}

	public Set<Menu> getMenu() {
		return menu;
	}

	public void setMenu(Set<Menu> menu) {
		this.menu = menu;
	}

	public Set<Area> getAreas() {
		return areas;
	}

	public void setAreas(Set<Area> areas) {
		this.areas = areas;
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

	public String getDomainCode() {
		return domainCode;
	}

	public void setDomainCode(String domainCode) {
		this.domainCode = domainCode;
	}

	public char getProfilingDates() {
		return profilingDates;
	}

	public void setProfilingDates(char profilingDates) {
		this.profilingDates = profilingDates;
	}

	public char getJumpProfiling() {
		return jumpProfiling;
	}

	public void setJumpProfiling(char jumpProfiling) {
		this.jumpProfiling = jumpProfiling;
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

	public String getModiftUt() {
		return modifyUt;
	}

	public void setModifyUt(String modifyUt) {
		this.modifyUt = modifyUt;
	}

	
}
