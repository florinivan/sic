package com.phimes.sic.business.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.model.Level;

@org.springframework.stereotype.Repository

public interface LevelRepository extends CrudRepository<Level, Long> {
	
	@Query("select lv.code, lv.description, lv.order from Level lv join Filter fl")
	Level getLevelFilterBy();

}
