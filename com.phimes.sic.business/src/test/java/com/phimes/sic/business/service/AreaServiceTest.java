package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.manipulation.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.query.Param;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.service.IService;
import com.phimes.sic.business.config.AppConfig;
import com.phimes.sic.business.model.Area;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class })
public class AreaServiceTest {

	@Autowired
	IService areaService;

	@Test
	public void test_findAll() {
		assertThat(areaService.get(1L)).hasFieldOrPropertyWithValue("code", "ar_code_test");
		assertThat(areaService.get(1L)).hasFieldOrPropertyWithValue("description", "ar_description_test");

	}

	@Test
	public void test_getAreaList() {

		List<Area> getAreaList = areaService.findAll();
		assertThat(getAreaList).isNotEmpty();
	}
}
