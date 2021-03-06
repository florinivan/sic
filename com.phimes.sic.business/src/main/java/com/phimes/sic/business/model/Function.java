package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_FUNCTION")
@SequenceGenerator(sequenceName = "prf_function_seq", initialValue = 1, allocationSize = 1, name = "PRF_FUN_SEQ")
public class Function {
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_role_function", joinColumns = @JoinColumn(name = "id_function"), inverseJoinColumns = @JoinColumn(name = "id_access"))
	private Set<Access> accesses = new HashSet<>();

	@ManyToMany(mappedBy = "functions")
	private Set<Role> roles = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "ID_APPLICATION")
	private Application application;

	@Column(name = "ID_FUNCTION")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_FUN_SEQ")
	@Id
	private Long idFunction;

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
