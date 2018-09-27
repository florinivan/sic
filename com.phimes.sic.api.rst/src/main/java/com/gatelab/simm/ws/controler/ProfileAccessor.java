package com.gatelab.simm.ws.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phimes.sic.api.service.IProfileAccessorService;


@Controller
@RequestMapping(value = "/auth/profile/accessor")
public class ProfileAccessor {
	
	@Autowired
	private IProfileAccessorService profileAccessorService;
	
	@GetMapping("/domains")
	@ResponseBody
	public List<String> domainCodeListBy(@RequestParam(name="username", required=true) String usernameUsr) {
		return profileAccessorService.getDomainCodeList(usernameUsr);
	}

}
