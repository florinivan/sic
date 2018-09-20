package com.phimes.sic.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.dto.UserProfileDto;
import com.phimes.sic.api.service.IProfileAccessorService;

@org.springframework.stereotype.Service
public class ProfileAccessorService implements IProfileAccessorService {
	
	private static final Character ACTIVE_STATE = 'A';
	
	UserProfileDto userProfileDto;
	
	List<RoleDto> roleDtoList;
	
	List<String> domaninCodeList;
	
	List<LevelDto> levelDtoList;
	
	List<FilterDto> filterDtoList;
	
	@Autowired
	UserService userService;
	@Autowired
	RoleService roleService;
	@Autowired
	LevelService levelService;
	@Autowired
	FilterService filterService;
	

	@Override
	public List<String> getDomainCodeList(String usernameUsr) {
		this.domaninCodeList=userService.getDomainCodeList(usernameUsr);
		return domaninCodeList ;
	}

	@Override
	public void logIn(String usernameUsr, String password, String domainCodeUsr) {
		this.userProfileDto=userService.getUsername(domainCodeUsr, usernameUsr);
		
		
	}

	@Override
	public List<RoleDto> getRoleList() {
		String codeArea= userProfileDto.getArea().getCode();
		String username= userProfileDto.getUserName();
		
		this.roleDtoList = roleService.getRoleListDto(codeArea, username, ACTIVE_STATE); 
		return roleDtoList;
	}

	@Override
	public List<LevelDto> getLevelList() {
		String codeArea=userProfileDto.getArea().getCode();
		levelDtoList=levelService.getLevelDtoList(codeArea);
		return levelDtoList;
	}

	@Override
	public List<FilterDto> getFilterList() {
		String codeArea = userProfileDto.getArea().getCode();
		this.filterDtoList= filterService.getFilterListDto(codeArea);
		return filterDtoList ;
	}

	@Override
	//Deve restituire lista di filtri in base al code livello.
	public List<FilterDto> getFilterList(LevelDto levelDto) {
		String codeArea = userProfileDto.getArea().getCode();
		
		
		return null;
	}
	

}
