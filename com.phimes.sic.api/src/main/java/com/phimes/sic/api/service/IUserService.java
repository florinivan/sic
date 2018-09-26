package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.UserProfileDto;

public interface IUserService {
	public List<String> getDomainCodeList(String username);

	public UserProfileDto getUsername(String domainCodeUsr, String username);

}
