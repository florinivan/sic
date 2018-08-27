package com.phimes.sic.business.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.LevelRepository;
import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.service.ILevelService;
import com.phimes.sic.business.model.Function;
import com.phimes.sic.business.model.Level;

@org.springframework.stereotype.Service
public class LevelService extends Service<LevelDto, Long> implements ILevelService {

	@Autowired
	private LevelRepository rep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public LevelDto getLevelDto() {
		Level level = rep.getLevelFilterBy();
		LevelDto levSer = modelMapper.map(level, LevelDto.class);
		return levSer;
	}
}
