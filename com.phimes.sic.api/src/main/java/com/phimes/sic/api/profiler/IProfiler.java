package com.phimes.sic.api.profiler;

import java.util.List;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.dto.UserProfileDto;


public interface IProfiler {

	//public ApplicationConfig getApplicationConfig(String applicationCode);
	
	public List<String> getDomainList(String applicationCode);
	
	public UserProfileDto logIn(String applicationCode, String password, String domain);
	
	public List<LevelDto> getLevelList(String applicationCode);
	
	public List<RoleDto> getRoleList(String applicationCode, String username);
	
	public List<FilterDto> getFilterList(String applicationCode, String username,String[] selectedFilterCodeList);
	
	public UserProfileDto getUserProfile(String applicationCode, UserProfileDto user, String roleCode, String[] selectedFilterCodeList);
	
	public UserProfileDto getUserProfile(String applicationCode, UserProfileDto user, String roleCode);
}
