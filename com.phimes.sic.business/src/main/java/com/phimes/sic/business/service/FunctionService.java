package com.phimes.sic.business.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.FunctionRepository;
import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.service.IFunctionService;
import com.phimes.sic.business.model.Area;
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

	public FunctionDto getFunctionDto() {
		Function function = rep.getFunctionAccess();
		FunctionDto funSer = modelMapper.map(function, FunctionDto.class);
		return funSer;
	}

}
