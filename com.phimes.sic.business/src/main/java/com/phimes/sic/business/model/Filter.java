package com.phimes.sic.business.model;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PRF_FILTER")
@SequenceGenerator(sequenceName = "prf_filter_seq", initialValue = 1, allocationSize = 1, name = "PRF_FIL_SEQ")
public class Filter {
	
	@ManyToOne
	@JoinColumn(name = "ID_LEVEL")
	private Level level;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_area_filter", joinColumns = @JoinColumn(name = "id_area"), inverseJoinColumns = @JoinColumn(name = "id_filter"))
	private Set<Area> areas = new HashSet<>();

	@Column(name = "ID_FILTER")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_FIL_SEQ")
	@Id
	private Long idFilter;

	@Column(name = "CODE")
	private String code;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "LONG_DESCRIPTION")
	private String longDescription;

	@Column(name = "CREATE_TS")
	private Timestamp createTs;

	@Column(name = "CREATE_UT")
	private String createUt;

	@Column(name = "MODIFY_TS")
	private Timestamp modifyTs;

	@Column(name = "MODIFY_UT")
	private String modifyUt;

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Set<Area> getAreas() {
		return areas;
	}

	public void setAreas(Set<Area> areas) {
		this.areas = areas;
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

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
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
