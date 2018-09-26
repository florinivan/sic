package com.phimes.sic.api.service;

import java.util.List;
import java.util.Set;



import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;


public interface IFilterService {
	
	public List<FilterDto> getFilterListDto(String codeAr, String codeLv);

	public List<FilterDto> getFilterListDtoByCodeApp(String codeApp);
	
	public List<FilterDto> getFilterListDtoByLevel(String codeLv);
	
	

}
