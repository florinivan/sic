package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.UserRepository;
import com.phimes.sic.business.model.User;

@org.springframework.stereotype.Service
public class UserService extends Service<User, Long> {

	@Autowired
	private UserRepository rep;

	@Override
	protected CrudRepository<User, Long> getCrudRep() {

		return rep;
	}

}
