package com.phimes.sic.api.profiler;

public class ProfileContext  {
	
	private static ProfileContext profileContextInstance;
	
	private ProfileContext() {};
	
	public static ProfileContext getInstance() {
		
		if(profileContextInstance==null) {
			profileContextInstance=new ProfileContext(); 
		}
		
		return profileContextInstance;
	}
	
	public IProfileAccessor getCurrentProfileAccessor() {
		return null;
	}
	
	public void setCurrentProfileAccessor (IProfileAccessor profileAccessor) {
		
	}

}
