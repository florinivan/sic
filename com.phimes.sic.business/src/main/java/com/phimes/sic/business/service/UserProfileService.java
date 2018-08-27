package com.phimes.sic.business.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.dao.FunctionRepository;
import com.phimes.sic.business.dao.UserProfileRepository;
import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.business.model.Area;
import com.phimes.sic.business.model.Function;

@org.springframework.stereotype.Service
public class UserProfileService {

	@Autowired
	private UserProfileRepository rep;

}