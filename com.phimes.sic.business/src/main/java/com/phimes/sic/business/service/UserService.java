package com.phimes.sic.business.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
import com.phimes.sic.api.dto.UserProfileDto;
import com.phimes.sic.api.service.IUserService;
import com.phimes.sic.business.dao.UserRepository;
import com.phimes.sic.business.model.Level;
import com.phimes.sic.business.model.Role;
import com.phimes.sic.business.model.User;

@org.springframework.stereotype.Service
@Component
public class UserService extends Service<User, Long> implements IUserService {

	@Autowired
	private UserRepository rep;

	@Override
	protected CrudRepository<User, Long> getCrudRep() {

		return rep;
	}



	public List<String> getDomainCodeList(String username) {
		Set<String> domainCode = rep.getDomainList(username);
		List<String> domCode = new ArrayList<String>();
		for (String item : domainCode) {
		domCode.add(item);
		}
		return domCode;

	}
	
	public UserProfileDto getUsername(String domainCodeUsr, String username) {
		User user= rep.findOne(domainCodeUsr, username);
		UserProfileDto userProfileDto = new UserProfileDto();
		userProfileDto.setUserName(username);
		return userProfileDto;
	}

}
