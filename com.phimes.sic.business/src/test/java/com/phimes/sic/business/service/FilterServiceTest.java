package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.service.IFilterService;
import com.phimes.sic.business.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class })

public class FilterServiceTest {
	@Autowired
	IFilterService filterService;

	@Test
	public void testGetFilterListDto() {
		String codeAr = "ar_code_test";
		String codeLv = "lev_code_test";

		List<FilterDto> listFilterDto = filterService.getFilterListDto(codeAr, codeLv);

		assertThat(listFilterDto).isNotEmpty();
	}

	@Test
	public void test_GetFilterListDto() {
		String codeApp = "app_code_test";

		List<FilterDto> listFilterDto = filterService.getFilterListDto(codeApp);

		assertThat(listFilterDto).isNotEmpty();
	}

	@Test
	public void testGetFilterListByLevel() {
		String codeLv = "lev_code_test";

		List<FilterDto> listFilterDtoByLevel = filterService.getFilterListDtoByLevel(codeLv);

		assertThat(listFilterDtoByLevel).isNotEmpty();
	}

}
