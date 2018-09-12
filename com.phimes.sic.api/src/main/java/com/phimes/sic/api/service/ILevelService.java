package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.LevelDto;

public interface ILevelService {
	public List<LevelDto> getLevelDto(String codeApp);

	public LevelDto getLevelDto(String codeApp, String codeFl);

}
