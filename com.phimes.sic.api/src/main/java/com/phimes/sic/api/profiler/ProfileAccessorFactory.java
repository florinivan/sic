package com.phimes.sic.api.profiler;

public class ProfileAccessorFactory {
	
	private static ProfileAccessorFactory profileAccessorFactoryInstance;
	
	private ProfileAccessorFactory() {}
	
	public ProfileAccessorFactory getInstance() {
		
		if(profileAccessorFactoryInstance==null) {
			profileAccessorFactoryInstance=new ProfileAccessorFactory(); 
		}
		return profileAccessorFactoryInstance;
	}
	
	public ProfileAccessor getProfileAccessor (String applicationCode) {
		
		return null;
		
	}
	
	public ProfileAccessor getProfileAccessor() {
		return null;
	}
	
	public void setProfileAccessor(ProfileAccessor profileAccessor) {
		
	}

	public void resetApplicationConfig(String appicationCode) {
		
	}
	
	//public void registerProfileAccessor(ProfilerConnector profilerConnector) {
	//		}
	public void setAccessorConnector(Class profileAccessorClass) {
		
	}
}









