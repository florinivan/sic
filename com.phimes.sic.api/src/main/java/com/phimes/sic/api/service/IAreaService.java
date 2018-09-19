package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.AreaDto;

public interface IAreaService  {
	public List<AreaDto> getListAreaDto(Long codeUsr, String codeApp);
	public AreaDto getAreaDto(Long codeUsr, String codeApp, String codeAr);

}
