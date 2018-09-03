package com.phimes.sic.business.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.FilterRepository;
import com.phimes.sic.business.dao.LevelRepository;
import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.service.ILevelService;
import com.phimes.sic.business.model.Filter;
import com.phimes.sic.business.model.Function;
import com.phimes.sic.business.model.Level;

@org.springframework.stereotype.Service
public class LevelService extends Service<LevelDto, Long> implements ILevelService {

	@Autowired
	private LevelRepository rep;
	
	@Autowired
	private FilterRepository filtroRep;

	@Override
	protected CrudRepository getCrudRep() {
		return rep;
	}

	ModelMapper modelMapper = new ModelMapper();

	public List<LevelDto> getLevelDto(String codeApp) {
		List<Level> level = rep.getLevelListFilterBy(codeApp);
		List<LevelDto> dtos = new ArrayList<LevelDto>();
		for (Level item : level) {
			LevelDto levSer = modelMapper.map(item, LevelDto.class);
			dtos.add(levSer);
		}

		return dtos;
	}

	
	//da finire di implementare il metodo
	
	@Override
	public LevelDto getLevelDto(Long idFilter) {
		Filter filtro =  filtroRep.findOne(idFilter);
		
		return null;
	}
}
