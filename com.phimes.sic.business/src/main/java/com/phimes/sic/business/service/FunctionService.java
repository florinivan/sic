package com.phimes.sic.business.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.FunctionRepository;
import com.phimes.sic.api.dto.AccessDto;
import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.service.IFunctionService;
import com.phimes.sic.business.model.Access;
import com.phimes.sic.business.model.Area;
import com.phimes.sic.business.model.Filter;
import com.phimes.sic.business.model.Function;

@org.springframework.stereotype.Service
public class FunctionService extends Service<FunctionDto, Long> implements IFunctionService {

	@Autowired
	private FunctionRepository rep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public List<FunctionDto> getFunctionListDto(String codeRl, String codeApp, String codeFz) {
		List<Function> function = rep.getFunctionRoleBy(codeRl, codeApp, codeFz);

		List<FunctionDto> retListFz = new ArrayList<>();

		for (Function item : function) {
			FunctionDto dto = modelMapper.map(item, FunctionDto.class);
			retListFz.add(dto);
		}
		return retListFz;
	}

	

	public FunctionDto getFunctionDto(String codeRl, String codeApp, String codeFz) {
		Function function = rep.findOne(codeRl, codeApp, codeFz);
		FunctionDto fzSer = modelMapper.map(function, FunctionDto.class);
		return fzSer;
	}

}
