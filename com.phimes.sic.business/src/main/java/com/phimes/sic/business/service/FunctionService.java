package com.phimes.sic.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.service.IFunctionService;
import com.phimes.sic.business.dao.FunctionRepository;
import com.phimes.sic.business.model.Function;

@org.springframework.stereotype.Service
public class FunctionService extends Service<Function, Long> implements IFunctionService {

	@Autowired
	private FunctionRepository rep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public List<FunctionDto> getFunctionListDto(String codeRl, String codeApp) {
		Set<Function> function = rep.getFunctionRoleBy(codeRl, codeApp);

		List<FunctionDto> retListFz = new ArrayList<>();

		for (Function item : function) {
			FunctionDto dto = modelMapper.map(item, FunctionDto.class);
			retListFz.add(dto);
		}
		return retListFz;
	}

	



}
