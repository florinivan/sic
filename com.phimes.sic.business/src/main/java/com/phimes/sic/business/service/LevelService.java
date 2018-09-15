package com.phimes.sic.business.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.FilterRepository;
import com.phimes.sic.business.dao.LevelRepository;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.service.ILevelService;
import com.phimes.sic.business.model.Level;

@org.springframework.stereotype.Service
public class LevelService extends Service<Level, Long> implements ILevelService {

	@Autowired
	private LevelRepository rep;

	@Autowired
	private FilterRepository filtroRep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public LevelDto getLevelDto(String codeApp, String codeFl) {
		Level level = rep.findOne(codeApp, codeFl);
		LevelDto levSer = modelMapper.map(level, LevelDto.class);
		return levSer;
	}

}
