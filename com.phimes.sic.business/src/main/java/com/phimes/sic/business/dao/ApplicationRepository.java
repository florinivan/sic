package com.phimes.sic.business.dao;

import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
