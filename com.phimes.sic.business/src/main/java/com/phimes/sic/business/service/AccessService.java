package com.phimes.sic.business.service;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.IdentifierAccessor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.ModelMap;

import com.phimes.sic.api.service.IAccessService;
import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.api.dto.AccessDto;
import com.phimes.sic.business.model.Access;

@org.springframework.stereotype.Component
public class AccessService extends Service<Access, Character> implements IAccessService{

	@Autowired
	private AccessRepository rep;

	@Override
	protected CrudRepository<Access, Character> getCrudRep() {
		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public List<AccessDto> getAccessDto(String code) {
		List<Access> access = rep.getAccessFunction(code);
		
		List<AccessDto> retList = new ArrayList<>();
		/*
		 * for(Access item:access){
		 * 
		 * 		inizio lavoro modelMapper
		 * 		AccessDto dto = new AccessDto();
		 * 		dto.setIdAccess(item.getIdAccess());
		 * 		dto.setDescription(item.getDescription);
		 * 		fine lavoro modelMapper
		 * 
		 * 		retList.add(dto);
		 * 		
		 * }
		 * 
		 * */
		for(Access item:access){
			AccessDto dto = modelMapper.map(item, AccessDto.class);
			retList.add(dto);
		}
		return retList;
	}

}
