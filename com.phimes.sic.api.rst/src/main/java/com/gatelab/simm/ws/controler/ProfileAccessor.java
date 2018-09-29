package com.gatelab.simm.ws.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
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
	
	@GetMapping("/login")
	@ResponseBody
	public void logIn(@RequestParam(name="usernameUsr", required=true)String usernameUsr,
					  @RequestParam(name="password", required=true) String password,
					  @RequestParam(name="domainCodeUsr, required=true") String domainCodeUsr) {
		profileAccessorService.logIn(usernameUsr, password, domainCodeUsr);
	}
	
	@GetMapping("/roles")
	@ResponseBody
	public List<RoleDto> rolesListBy(){
		return profileAccessorService.getRoleList();
	}
	
	@GetMapping("/levels")
	@ResponseBody
	public List<LevelDto> levelListBy(){
		return profileAccessorService.getLevelList();
	}
	
	@GetMapping("/filters")
	@ResponseBody
	public List<FilterDto> filterListBy(){
		return profileAccessorService.getFilterList();
		//In ProfileAccessorService ci sono due metodi getFilterList, li lasciamo così o uno lo cambiamo?? (Mada)
	}
	
	//Manca ultimo metodo perchè non so come gestire i nomi in @getMapping
	

}