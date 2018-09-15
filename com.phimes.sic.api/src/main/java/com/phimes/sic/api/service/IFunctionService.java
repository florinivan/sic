package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.FunctionDto;

public interface IFunctionService {
	public List<FunctionDto> getFunctionListDto(String codeRl, String codeApp);

}
