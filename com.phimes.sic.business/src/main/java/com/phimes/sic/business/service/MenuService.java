package com.phimes.sic.business.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.MenuRepository;
import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.dto.MenuDto;
import com.phimes.sic.api.service.IMenuService;
import com.phimes.sic.business.model.Filter;
import com.phimes.sic.business.model.Function;
import com.phimes.sic.business.model.Menu;

@org.springframework.stereotype.Service
public class MenuService extends Service<MenuDto, Long> implements IMenuService {

	@Autowired
	private MenuRepository rep;

	@Override
	protected CrudRepository getCrudRep() {

		return rep;
	}
	
	ModelMapper modelMapper = new ModelMapper();

	public MenuDto getMenuAccess() {
		Menu menu = rep.getAllMenuSubMenu();
		MenuDto menuSer = modelMapper.map(menu, MenuDto.class);
		return menuSer;
		
	}

}
