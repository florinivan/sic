package com.phimes.sic.business.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.AreaRepository;
import com.phimes.sic.api.dto.AccessDto;
import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.api.service.IAreaService;
import com.phimes.sic.business.model.Access;
import com.phimes.sic.business.model.Area;

@org.springframework.stereotype.Service
public class AreaService extends Service<AreaDto, Long> implements IAreaService  {

	@Autowired
	private AreaRepository rep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public AreaDto getAreaDto(String codeUsr, String codeApp, String codeAr) {
		Area area = rep.getAreaApplicationUser(codeUsr, codeApp, codeAr);
		AreaDto areaSer = modelMapper.map(area, AreaDto.class);
		return areaSer;
	}
}