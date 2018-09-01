package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_ROLE")
@SequenceGenerator(sequenceName = "prf_role_seq", initialValue = 1, allocationSize = 1, name = "PRF_ROL_SEQ")
public class Role {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_ROL_SEQ")
	

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_role_menu", joinColumns = @JoinColumn(name = "id_role"), inverseJoinColumns = @JoinColumn(name = "id_menu"))
	private Set<Menu> menu = new HashSet<>();

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_role_function", joinColumns = @JoinColumn(name = "id_role"), inverseJoinColumns = @JoinColumn(name = "id_function"))
	private Set<Function> functions = new HashSet<>();

	@ManyToMany(mappedBy = "roles")
	private Set<User> users = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "ID_STATE")
	private State state;

	@ManyToOne
	@JoinColumn(name = "ID_APPLICATION")
	private Application application;

	@Column(name = "ID_ROLE")
	@Id
	private Long idRole;

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

	public Set<Menu> getMenu() {
		return menu;
	}

	public void setMenu(Set<Menu> menu) {
		this.menu = menu;
	}

	public Set<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(Set<Function> functions) {
		this.functions = functions;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
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
