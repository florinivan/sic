package com.phimes.sic.business.configuration;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Configuration {

	private static Configuration istanza;

	public static Configuration getInstance() {
		if (istanza == null) {
			istanza = new Configuration();
		}

		return istanza;
	}

	public Configuration load(URL url) {
		return null;
	}

	public Configuration load(File file) {
		return null;
	}

	public Configuration load(InputStream stream) {
		return null;
	}

	public void save(File file) {

	}

	public void save(OutputStream stream) {

	}

	public Class getProfilerConnectorClass() {
		return null;
	}

	public void setProfilerConnectorClass(Class profilerConnectorClass) {

	}

	public Class getProfileAccessorClass() {
		return null;
	}

	public void setProfileAccessorClass(Class profileAccessorClass) {

	}

	public Class getDbConnectionProviderClassAccessorClass() {
		return null;
	}

	public void setDbConnectionProviderClass(Class dbConnectionProviderClass) {

	}

	public Class getAuthenticationConnectionProviderClass() {
		return null;
	}

	public void setAuthenticationConnectionProviderClass(Class authenticationConnectionProviderClass) {

	}

	public String getJndiDataSource() {
		return null;
	}

	public void setJndiDataSource(String jndiDataSource) {

	}

	public String getUserDataSource() {
		return null;
	}

	public void setUserDataSource(String userDataSource) {

	}

	public String getPasswordDataSource() {
		return null;
	}

	public void setPasswordDataSource(String passwordDataSource) {

	}

	public Class getDriverDataSource() {
		return null;
	}

	public void setDriverDataSource(Class driverDataSource) {

	}

	public String getUrlDataSource() {
		return null;
	}

	public void setUrlDataSource(String urlDataSource) {

	}

	public String getJndiProfiler() {
		return null;
	}

	public void setJndiProfiler(String jndiProfiler) {

	}

	public String getHostLDAP() {
		return null;
	}

	public void setHostLDAP(String hostLDAP) {

	}

	public String getUserLDAP() {
		return null;
	}

	public void setUserLDAP(String userLDAP) {

	}

	public String getPasswordLDAP() {
		return null;
	}

	public void setPasswordLDAP(String passwordLDAP) {

	}

	public String getRootLDAP() {
		return null;
	}

	public void setRootLDAP(String rootLDAP) {

	}

	public String getApplicationCode() {
		return null;
	}

	public void setApplicationCode(String applicationCode) {

	}

	public String getLoginPage() {
		return null;
	}

	public void setLoginPage(String loginPage) {

	}

	public String getProfilePage() {
		return null;
	}

	public void setProfilePage(String profilePage) {

	}

	public String getHomePage() {
		return null;
	}

	public void setHomePage(String homePage) {

	}

	public Class getProfilerDirectClass() {
		return null;
	}

	public void setProfilerDirectClass(Class profilerDirectClass) {

	}

}
