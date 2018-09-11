package com.phimes.sic.business.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.FilterRepository;
import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.service.IFilterService;
import com.phimes.sic.business.model.Filter;

@org.springframework.stereotype.Service
public class FilterService extends Service<FilterDto, Long> implements IFilterService {

	@Autowired
	private FilterRepository rep;
	
	@Override
	protected CrudRepository getCrudRep() {
		
		return rep;
	}
	
	ModelMapper modelMapper = new ModelMapper();
	public FilterDto getFilterDto(String codeAr, String codeLv, String codeFl) {
		Filter filter = rep.findOne(codeAr, codeLv, codeFl);
		FilterDto filSer = modelMapper.map(filter, FilterDto.class);
		return filSer;
	}
}
