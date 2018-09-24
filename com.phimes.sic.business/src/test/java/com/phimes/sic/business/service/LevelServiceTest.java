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
public class LevelServiceTest {
	@Autowired
	IService levelService;

	@Test
	public void test_findAll() {
		assertThat(levelService.get(1L)).hasFieldOrPropertyWithValue("code", "lev_code_test");
		assertThat(levelService.get(1L)).hasFieldOrPropertyWithValue("description", "lev_description_test");
		assertThat(levelService.get(1L)).hasFieldOrPropertyWithValue("levelOrder", 2);
	}

	@Test
	public void test_getAreaList() {

		List<Area> getLevelList = levelService.findAll();
		assertThat(getLevelList).isNotEmpty();
	}

}
