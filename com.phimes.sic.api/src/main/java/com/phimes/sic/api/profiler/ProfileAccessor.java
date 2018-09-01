package com.phimes.sic.api.profiler;

import java.util.List;
import java.util.Map;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.dto.UserProfileDto;

public interface ProfileAccessor {
	
	public void setApplicationCode(String applicationCode);
	
	public void setProfiler (Profiler profiler);
	
	//public ApplicationConfig getApplicationConfig();
	
	public List<String> getDomainList();
	
	public void logIn (String user,String password ,String domainCode);
	
	public List<RoleDto> getRoleList();
	
	public List<LevelDto> getLevelList();
	
	public List<FilterDto> getFilterlList(String codeLevel);
	
	public List<FilterDto> getFilterList (LevelDto levelDto);
	    
	public void setFilter (String filterCode, String levelCode);
	
	public void setFilter (FilterDto filterDto);
	
	public void setRole (String roleCode);
	
	public void setRole (RoleDto roleDto);
	
	public UserProfileDto getUserProfilerDto();
	
	public void resetProfile();
	
	public void logOut();
	
	public boolean isUniqueProfile();
	
	public boolean isProfileSelected();
	
	public boolean isAuthenticated();
	
	public boolean isAuthorized();
	
	public boolean hasFunctionAccess(String functionAccessPattern);
	
	public boolean hasAllFunctionAccess(String functionAccessList);
	
	public boolean hasSomeFunctionAccess(String functionAccessList);
	
	public Map<String, Boolean> getHasFunctionAccess();
	
	public Map<String, Boolean> getHasAllFunctionAccess();
	
	public Map<String, Boolean> getHasSomeFunctionAccess();
	
	public void profile();
	
	
	
	

}
