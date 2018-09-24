package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.service.IService;
import com.phimes.sic.business.config.AppConfig;
import com.phimes.sic.business.model.Area;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class })

public class FilterServiceTest {
	@Autowired
	IService filterService;

	@Test
	public void test_findAll() {
		assertThat(filterService.get(1L)).hasFieldOrPropertyWithValue("code", "fil_code_test");
		assertThat(filterService.get(1L)).hasFieldOrPropertyWithValue("description", "fil_description_test");
		assertThat(filterService.get(1L)).hasFieldOrPropertyWithValue("longDescription", "fil_long_description_test");

	}

	@Test
	public void test_getAreaList() {

		List<Area> getFilterList = filterService.findAll();
		assertThat(getFilterList).isNotEmpty();
	}

}
