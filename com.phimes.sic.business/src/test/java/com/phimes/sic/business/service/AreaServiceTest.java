package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.AreaDto;
import com.phimes.sic.api.service.IAreaService;
import com.phimes.sic.business.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class })
public class AreaServiceTest {

	@Autowired
	IAreaService areaService;

	@Test
	public void testGetAreaDto() {
		String username = "us_username_test";
		String codeApp = "app_code_test";
		String codeAr = "ar_code_test";

		AreaDto areaDto = areaService.getAreaDto(username, codeApp, codeAr);

		assertThat(areaDto).isNotNull();
	}

	@Test
	public void testGetListAreaDto() {
		String username = "us_username_test";
		String codeApp = "app_code_test";

		List<AreaDto> listAreaDto = areaService.getAreaListDto(username, codeApp);

		assertThat(listAreaDto).isNotEmpty();
	}

}
