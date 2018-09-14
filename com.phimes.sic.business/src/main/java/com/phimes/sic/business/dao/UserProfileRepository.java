package com.phimes.sic.business.dao;

import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.User;

@org.springframework.stereotype.Repository

public interface UserProfileRepository extends CrudRepository<User, Long> {

}
