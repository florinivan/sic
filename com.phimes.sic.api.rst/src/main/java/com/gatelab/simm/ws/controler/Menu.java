package com.gatelab.simm.ws.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.phimes.sic.api.dto.MenuDto;
import com.phimes.sic.api.service.IMenuService;

@Controller
@RequestMapping(value = "/auth/menu")

public class Menu {

	@Autowired
	private IMenuService menuService;

	@GetMapping("/menus")
	@ResponseBody
	public List<MenuDto> menusListBy(@RequestParam(name = "codeRl", required = true) String codeRl,
			@RequestParam(name = "codeApp", required = true) String codeApp,
			@RequestParam(name = "idSubMenu", required = true) Long idSubMenu) {
		return menuService.getMenuDto(codeRl, codeApp, idSubMenu);
	}

}
