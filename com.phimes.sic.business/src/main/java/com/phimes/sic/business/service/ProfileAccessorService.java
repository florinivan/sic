package com.phimes.sic.business.service;

import java.util.List;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.service.IProfileAccessorService;

@org.springframework.stereotype.Service
public class ProfileAccessorService implements IProfileAccessorService {

	@Override
	public List<String> getDomainList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void logIn(String user, String password, String domainCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RoleDto> getRoleList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LevelDto> getLevelList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FilterDto> getFilterlList(String codeLevel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FilterDto> getFilterList(LevelDto levelDto) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
