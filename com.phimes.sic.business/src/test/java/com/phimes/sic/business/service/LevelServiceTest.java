package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.service.ILevelService;
import com.phimes.sic.business.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class })
public class LevelServiceTest {
	@Autowired
	ILevelService levelService;

	@Test
	public void testGetLevelDto() {
		String codeApp = "app_code_test";
		String codeFl = "fil_code_test";

		LevelDto levelDto = levelService.getLevelDto(codeApp, codeFl);

		assertThat(levelDto).isNotNull();
	}

	@Test
	public void testGetLevelListDto() {
		String codeApp = "app_code_test";

		List<LevelDto> listLevelDto = levelService.getLevelListDto(codeApp);

		assertThat(listLevelDto).isNotEmpty();
	}

}
