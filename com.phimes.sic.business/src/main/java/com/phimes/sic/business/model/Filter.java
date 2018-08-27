package com.phimes.sic.business.model;

import javax.persistence.*;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PRF_FILTER")
@SequenceGenerator(sequenceName = "prf_filter_seq", initialValue = 1, allocationSize = 1, name = "PRF_FIL_SEQ")
public class Filter {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRF_FIL_SEQ")
	
	@ManyToOne
	@JoinColumn(name = "ID_LEVEL")
	private Level level;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "prf_filter_area", joinColumns = @JoinColumn(name = "id_filter"), inverseJoinColumns = @JoinColumn(name = "id_area"))
	private Set<Area> areas = new HashSet<>();

	@Column(name = "ID_FILTER")
	@Id
	private Long idFilter;

	@Column(name = "CODE")
	private String code;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "LONG_DESCRIPTION")
	private String longDescription;

	@Column(name = "TS_CREATION")
	private Timestamp tsCreation;

	@Column(name = "UT_CREATION")
	private String utCreation;

	@Column(name = "TS_MODIFY")
	private Timestamp tsModify;

	@Column(name = "UT_MODIFY")
	private String utModify;

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
