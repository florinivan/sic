package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.AreaDto;

public interface IAreaService  {
	public AreaDto getAreaDto(String username, String codeApp, String codeAr);
	public List<AreaDto> getAreaListDto(String username, String codeApp);

}
