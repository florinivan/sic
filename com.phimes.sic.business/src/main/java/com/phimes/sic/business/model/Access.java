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

	@Column(name = "ACCESS_ORDER")
	private Integer accessOrder;

	@Column(name = "CREATE_TS")
	private Timestamp createTs;

	@Column(name = "CREATE_UT")
	private String createUt;

	@Column(name = "MODIFY_TS")
	private Timestamp modifyTs;

	@Column(name = "MODIFY_UT")
	private String modifyUt;

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

	public Integer getAccessOrder() {
		return accessOrder;
	}

	public void setAccessOrder(Integer accessOrder) {
		this.accessOrder = accessOrder;
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
