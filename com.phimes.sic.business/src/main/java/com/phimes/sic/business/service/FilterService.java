package com.phimes.sic.business.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.FilterRepository;
import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.service.IFilterService;
import com.phimes.sic.business.model.Filter;
import com.phimes.sic.business.model.Function;

@org.springframework.stereotype.Service
public class FilterService extends Service<FilterDto, Long> implements IFilterService {

	@Autowired
	private FilterRepository rep;

	@Override
	protected CrudRepository getCrudRep() {

		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public List<FilterDto> getListFilterDto(String codeAr, String codeLv) {
		List<Filter> filter = rep.getFilterList(codeAr, codeLv);

		List<FilterDto> retListFl = new ArrayList<>();

		for (Filter item : filter) {
			FilterDto dto = modelMapper.map(item, FilterDto.class);
			retListFl.add(dto);
		}
		return retListFl;
	}

	public FilterDto getFilterDto(String codeAr, String codeLv) {
		Filter filter = rep.findOne(codeAr, codeLv);
		FilterDto filSer = modelMapper.map(filter, FilterDto.class);
		return filSer;
	}

}