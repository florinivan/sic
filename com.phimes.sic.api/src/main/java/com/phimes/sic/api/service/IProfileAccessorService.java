package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.dto.UserProfileDto;

public interface IProfileAccessorService {
	
	public UserProfileDto getUserProfileDto();
	//Ho modificato tutti i metodi, aggiungendo i parametri in entrata (Mada)
	public List<String> getDomainCodeList(String usernameUsr);
	
	public void logIn (String user,String password ,String domainCode);
	
	public List<RoleDto> getRoleList();
	
	public List<LevelDto> getLevelList();
	
	public List<FilterDto> getFilterList();
	
	public List<FilterDto> getFilterList (LevelDto levelDto);

}
