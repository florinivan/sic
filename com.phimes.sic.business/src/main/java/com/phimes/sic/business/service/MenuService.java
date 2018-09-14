package com.phimes.sic.business.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.MenuRepository;
import com.phimes.sic.api.dto.MenuDto;
import com.phimes.sic.api.service.IMenuService;
import com.phimes.sic.business.model.Menu;

@org.springframework.stereotype.Service
public class MenuService extends Service<Menu, Long> implements IMenuService {

	@Autowired
	private MenuRepository rep;

	@Override
	protected CrudRepository getCrudRep() {

		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public List<MenuDto> getMenuDto(String codeRl, String codeApp, String codeMn) {
		List<Menu> menu = rep.getAllMenuSubMenu(codeRl, codeApp, codeMn);
		List<MenuDto> retListMn = new ArrayList<>();

		for (Menu item : menu) {
			MenuDto dto = modelMapper.map(item, MenuDto.class);
			retListMn.add(dto);
		}
		return retListMn;

	}

}
