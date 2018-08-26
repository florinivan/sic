package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@org.springframework.stereotype.Repository

public interface UserProfileRepository {
	@Query("select ut.userName, role, area from User ut join Role role join Area area where ut.username = :username")
	Stream getUserProfileBy (@Param ("username") String username );

}
