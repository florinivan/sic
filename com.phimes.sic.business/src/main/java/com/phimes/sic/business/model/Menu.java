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

	
}
