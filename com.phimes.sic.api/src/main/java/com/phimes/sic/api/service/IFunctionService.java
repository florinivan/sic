package com.phimes.sic.api.service;

import java.util.List;

import com.phimes.sic.api.dto.FunctionDto;

public interface IFunctionService {
	public List<FunctionDto> getFunctionDto(String CodeRl);
	
	public FunctionDto getFunctionDto(String CodeApp, String CodeFz);
	
	

}
