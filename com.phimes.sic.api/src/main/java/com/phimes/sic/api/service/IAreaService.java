package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.AreaDto;

public interface IAreaService  {
	public List<AreaDto> getAreaDto(String codeUsr, String codeApp, String codeAr, Character idStateSt);

}
