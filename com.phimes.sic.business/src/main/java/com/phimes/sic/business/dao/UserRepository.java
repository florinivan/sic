package com.phimes.sic.business.dao;

import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.User;

public interface UserRepository  extends CrudRepository<User, Long> {

}
