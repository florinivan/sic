package com.gatelab.simm.ws.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.service.IRoleService;

@Controller
@RequestMapping(value = "/auth/ole")
public class Role {

	@Autowired
	private IRoleService roleService;

	@GetMapping("/roles")
	@ResponseBody
	public List<RoleDto> rolesListBy(@RequestParam(name = "codeApp", required = true) String codeApp,
			@RequestParam(name = "username", required = true) String username,
			@RequestParam(name = "idStateRl", required = true) Character idStateRl) {
		return roleService.getRoleListDto(codeApp, username, idStateRl);
	}

	@GetMapping("/role")
	@ResponseBody
	public RoleDto roleBy(@RequestParam(name = "codeApp", required = true) String codeApp,
			@RequestParam(name = "username", required = true) String username,
			@RequestParam(name = "codeRl", required = true) String codeRl,
			@RequestParam(name = "idStateRl", required = true) Character idStateRl) {
		return roleService.getRoleDto(codeApp, username, codeRl, idStateRl);
	}

}
