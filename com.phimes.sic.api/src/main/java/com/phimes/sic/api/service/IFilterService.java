package com.phimes.sic.api.service;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;

public interface IFilterService {
	public FilterDto getFilterDto(String codeAr, String codeLv, String codeFl);
	


}
