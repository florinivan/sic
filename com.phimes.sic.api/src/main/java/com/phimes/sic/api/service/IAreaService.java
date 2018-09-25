package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.AreaDto;

public interface IAreaService  {
	public List<AreaDto> getListAreaDto(String username, String codeApp);
	public AreaDto getAreaDto(String username, String codeApp, String codeAr);

}
