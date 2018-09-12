package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_MENU")
public class Menu {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_MENU_SEQ")
	@SequenceGenerator(sequenceName = "prf_menu_seq", initialValue = 1, allocationSize = 1, name = "PRF_MENU_SEQ")

	@ManyToMany(mappedBy = "menu")
	private Set<Role> roles = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "ID_APPLICATION")
	private Application application;

	@Column(name = "ID_MENU")
	@Id
	private Long idMenu;

	/*
	 * @Column(name = "ID_SUB_MENU") private Long idSubMenu;
	 */

	@Column(name = "CODE")
	private String code;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "URL")
	private String url;

	@Column(name = "MENU_ORDER")
	private Integer menuOrder;

	@Column(name = "CREATE_TS")
	private Timestamp createTs;

	@Column(name = "CREATE_UT")
	private String createUt;

	@Column(name = "MODIFY_TS")
	private Timestamp modifyTs;

	@Column(name = "MODIFY_UT")
	private String modifyUt;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
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
