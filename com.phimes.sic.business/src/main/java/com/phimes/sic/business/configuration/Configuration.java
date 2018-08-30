package com.phimes.sic.business.configuration;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Properties;

import org.hibernate.boot.archive.internal.UrlInputStreamAccess;

public class Configuration {
	
	private static Configuration istanza;

	private static String fileProperties = "C:\\Phimes\\eclipse-workspace\\sic\\com.phimes.sic.business\\src\\main\\java\\application.properties";
    
	private Configuration() {
		
	}
	
	public static Configuration getInstance() {
		if (istanza == null) {
			istanza = new Configuration();
		}

		return istanza;
	}

	public Configuration load(URL url) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		// prendere il stream da bufferedReader
		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();

		return load(url);
	}

	public Configuration load(File file) throws IOException {

		// serve qua transformare il file in imputstream e dopo basta perchè richiama
        // l'altro metodo load(stream)
		
		InputStream stream = new FileInputStream(file);

		return load(stream);
	}

	public Configuration load(InputStream stream) throws IOException{

		Properties prop = new Properties();
		try {
			
			if (stream == null) {
				System.out.println("Sorry, unable to find " + fileProperties);

			}

			// load a properties file from class path, inside static method
			prop.load(stream);
			Enumeration e = prop.keys();

			while (e.hasMoreElements()) {
				// key from file properties
				Object obj = e.nextElement();
				// value from file properties
				String result = prop.getProperty(obj.toString());
				switch (obj.toString()) {
				case "spring.datasource.url":
					getInstance().setJndiDataSource(result);
					break;
				case "spring.datasource.username":
					getInstance().setUserDataSource(result);
					break;
				case "spring.datasource.password":
					getInstance().setUserDataSource(result);
					break;
				case "spring.datasource.driver-class":
					getInstance().setUserDataSource(result);
					break;

				}
			}
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return istanza;
	}

	public void save(File file) throws IOException {

		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileProperties));
			os.writeObject(file);
			os.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException ex) {

			ex.printStackTrace();
		}

	}

	public void save(OutputStream stream) {

		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileProperties));
			os.writeObject(stream);
			os.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException ex) {

			ex.printStackTrace();
		}

		
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
