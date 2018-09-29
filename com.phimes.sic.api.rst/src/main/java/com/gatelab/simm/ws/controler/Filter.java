package com.gatelab.simm.ws.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.service.IFilterService;

	@Controller
	@RequestMapping(value = "/auth/filter")
	public class Filter {
		
		@Autowired
		private IFilterService filterService;
		
		@GetMapping("/filter")
		@ResponseBody 
		public List<FilterDto> filterList(@RequestParam(name="codeAr", required=true)String codeAr,
										  @RequestParam(name="codeLv", required= true)String codeLv) {
			return filterService.getFilterListDto(codeAr, codeLv);
		}
	
		//Gli altri due metodi getFilterListDtoByCodeApp e getFilterListDtoByLevel, non ci sono perchè sono in ProfileAccessor.java
	}
