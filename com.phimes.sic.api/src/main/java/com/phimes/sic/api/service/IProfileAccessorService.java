package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;

public interface IProfileAccessorService {
	public List<String> getDomainList();
	
	public void logIn (String user,String password ,String domainCode);
	
	public List<RoleDto> getRoleList();
	
	public List<LevelDto> getLevelList();
	
	public List<FilterDto> getFilterlList(String codeLevel);
	
	public List<FilterDto> getFilterList (LevelDto levelDto);

}
