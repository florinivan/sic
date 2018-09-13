package com.phimes.sic.business.model;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PRF_LEVEL")
@SequenceGenerator(sequenceName = "prf_level_seq", initialValue = 1, allocationSize = 1, name = "PRF_LEV_SEQ")
public class Level {

	@OneToMany(mappedBy = "level")
	private Set<Filter> filters;

	@ManyToOne
	@JoinColumn(name = "ID_APPLICATION")
	private Application application;

	@Column(name = "ID_LEVEL")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_LEV_SEQ")
	@Id
	private Long idLevel;

	@Column(name = "CODE")
	private String code;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "LEVEL_ORDER")
	private Integer levelOrder;

	@Column(name = "CREATE_TS")
	private Timestamp createTs;

	@Column(name = "CREATE_UT")
	private String createUt;

	@Column(name = "MODIFY_TS")
	private Timestamp modifyTs;

	@Column(name = "MODIFY_UT")
	private String modifyUt;

	public Set<Filter> getFilters() {
		return filters;
	}

	public void setFilters(Set<Filter> filters) {
		this.filters = filters;
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

	public Integer getLevel_Order() {
		return levelOrder;
	}

	public void setLevelOrder(Integer levelOrder) {
		this.levelOrder = levelOrder;
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
