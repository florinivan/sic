package com.gatelab.simm.ws.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phimes.sic.api.dto.AccessDto;
import com.phimes.sic.api.service.IAccessService;

@Controller
@RequestMapping(value = "/auth/Access")

public class Access {

	@Autowired
	private IAccessService accessService;

	@GetMapping("/accesses")
	@ResponseBody
	public List<AccessDto> accessesListBy(@RequestParam(name = "codeFz", required = true) String codeFz) {
		return accessService.getAccessDto(codeFz);
	}

}
