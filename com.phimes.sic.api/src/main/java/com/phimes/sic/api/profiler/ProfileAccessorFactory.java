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
	
	public IProfileAccessor getProfileAccessor (String applicationCode) {
		
		return null;
		
	}
	
	public IProfileAccessor getProfileAccessor() {
		return null;
	}
	
	public void setProfileAccessor(IProfileAccessor profileAccessor) {
		
	}

	public void resetApplicationConfig(String appicationCode) {
		
	}
	
	//public void registerProfileAccessor(ProfilerConnector profilerConnector) {
	//		}
	public void setAccessorConnector(Class profileAccessorClass) {
		
	}
}









