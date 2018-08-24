package com.phimes.sic.business.dao;

import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Menu;

public interface MenuRepository  extends CrudRepository<Menu, Long> {
}
