package com.phimes.sic.business.service;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mapping.IdentifierAccessor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.ModelMap;

import com.phimes.sic.api.service.IAccessService;
import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.api.dto.AccessDto;
import com.phimes.sic.business.model.Access;

@org.springframework.stereotype.Service
public class AccessService extends Service<Access, Character> implements IAccessService{

	@Autowired
	private AccessRepository rep;

	@Override
	protected CrudRepository<Access, Character> getCrudRep() {
		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public AccessDto getAccessDto() {
		Access access = rep.getAccessFunction();
		AccessDto accSer = modelMapper.map(access, AccessDto.class);
		return accSer;
	}

}
