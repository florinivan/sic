package com.phimes.sic.business.model;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "PRF_PARAMETER")
public class Parameter {

	@ManyToOne
	@JoinColumn(name = "ID_APPLICATION")
	private Application application;

	@Column(name = "ID_PARAMETER")
	@Id
	private String idParameter;

	@Column(name = "VALUE")
	private String value;

	@Column(name = "TS_CREATION")
	private Timestamp tsCreazione;

	@Column(name = "UT_CREATION")
	private String utCreazione;

	@Column(name = "TS_MODIFY")
	private Timestamp tsModifica;

	@Column(name = "UT_MODIFY")
	private String utModify;

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Timestamp getTsCreazione() {
		return tsCreazione;
	}

	public void setTsCreazione(Timestamp tsCreazione) {
		this.tsCreazione = tsCreazione;
	}

	public String getUtCreazione() {
		return utCreazione;
	}

	public void setUtCreazione(String utCreazione) {
		this.utCreazione = utCreazione;
	}

	public Timestamp getTsModifica() {
		return tsModifica;
	}

	public void setTsModifica(Timestamp tsModifica) {
		this.tsModifica = tsModifica;
	}

	public String getUtModify() {
		return utModify;
	}

	public void setUtModify(String utModify) {
		this.utModify = utModify;
	}

}
