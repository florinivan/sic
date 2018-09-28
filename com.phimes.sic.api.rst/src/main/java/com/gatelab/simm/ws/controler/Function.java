package com.gatelab.simm.ws.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.service.IFunctionService;

@Controller
@RequestMapping(value = "/auth/Function")

public class Function {

	@Autowired
	private IFunctionService functionService;

	@GetMapping("/functions")
	@ResponseBody
	public List<FunctionDto> functionsListBy(@RequestParam(name = "codeRl", required = true) String codeRl,
			@RequestParam(name = "codeApp", required = true) String codeApp) {
		return functionService.getFunctionListDto(codeRl, codeApp);
	}

}
