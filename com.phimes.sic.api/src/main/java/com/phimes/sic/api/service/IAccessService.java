package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.AccessDto;

public interface IAccessService  {
	
	public List<AccessDto> getAccessDto(String Code);

}
