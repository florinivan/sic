package com.phimes.sic.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.dto.UserProfileDto;
import com.phimes.sic.api.service.IFilterService;
import com.phimes.sic.api.service.ILevelService;
import com.phimes.sic.api.service.IProfileAccessorService;
import com.phimes.sic.api.service.IRoleService;
import com.phimes.sic.api.service.IUserService;

@org.springframework.stereotype.Service
public class ProfileAccessorService implements IProfileAccessorService {
	
	private static final Character ACTIVE_STATE = 'A';
	private static final String CODE_APP = "app_code_test";
	
	private UserProfileDto userProfileDto;
	
	private List<RoleDto> roleDtoList;
	
	private List<String> domaninCodeList;
	
	private List<LevelDto> levelDtoList;
	
	private List<FilterDto> filterDtoList;
	
	@Autowired
	IUserService userService;
	@Autowired
	IRoleService roleService;
	@Autowired
	ILevelService levelService;
	@Autowired
	IFilterService filterService;
	

	@Override
	public List<String> getDomainCodeList(String usernameUsr) {
		this.domaninCodeList=userService.getDomainCodeList(usernameUsr);
		return domaninCodeList ;
	}

	@Override
	public void logIn(String usernameUsr, String password, String domainCodeUsr) {
		this.userProfileDto=userService.getUsername(domainCodeUsr, usernameUsr);
		// setare anche il primo role e prima area del utente
		
	}

	@Override
	public List<RoleDto> getRoleList() {
		//String codeArea= userProfileDto.getArea().getCode();
		String username= userProfileDto.getUserName();
		
		this.roleDtoList = roleService.getRoleListDto(CODE_APP, username, ACTIVE_STATE);
		return roleDtoList;
	}

	@Override
	public List<LevelDto> getLevelList() {
		//String codeArea=userProfileDto.getArea().getCode();
		levelDtoList=levelService.getLevelDtoList(CODE_APP);
		return levelDtoList;
	}

	@Override
	public List<FilterDto> getFilterList() {
		//String codeArea = userProfileDto.getArea().getCode();
		this.filterDtoList= filterService.getFilterListDto(CODE_APP);
		return filterDtoList ;
	}

	@Override
	//Deve restituire lista di filtri in base al code livello.
	public List<FilterDto> getFilterList(LevelDto levelDto) {
		
		return null;
	}
	

}
