package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;

public interface IFilterService {
	public List<FilterDto> getListFilterDto(String codeAr, String codeLv, String codeFl);

	public FilterDto getFilterDto(String codeAr, String codeLv, String codeFl);

}
