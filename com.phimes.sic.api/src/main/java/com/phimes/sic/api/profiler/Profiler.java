package com.phimes.sic.api.profiler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.dto.UserProfileDto;
import com.phimes.sic.api.service.ILevelService;

public class Profiler implements IProfiler {
	
	@Autowired
	private ILevelService levelService;

	@Override
	public List<String> getDomainList(String applicationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfileDto logIn(String applicationCode, String password, String domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LevelDto> getLevelList(String applicationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleDto> getRoleList(String applicationCode, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FilterDto> getFilterList(String applicationCode, String username, String[] selectedFilterCodeList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfileDto getUserProfile(String applicationCode, UserProfileDto user, String roleCode,
			String[] selectedFilterCodeList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfileDto getUserProfile(String applicationCode, UserProfileDto user, String roleCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
