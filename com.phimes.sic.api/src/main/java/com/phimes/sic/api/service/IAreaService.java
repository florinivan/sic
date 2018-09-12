package com.phimes.sic.api.service;

import com.phimes.sic.api.dto.AreaDto;

public interface IAreaService  {
	public AreaDto getAreaDto(String codeUsr, String codeApp, String codeAr, Character idStateSt);

}
