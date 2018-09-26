
package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.AccessDto;
import com.phimes.sic.api.service.IAccessService;

import com.phimes.sic.business.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class })

public class AccessServiceTest {

	@Autowired

	IAccessService accessService;

	@Test

	public void test_getAccessDto() {

		String codeFz = "fun_code_test";

		List<AccessDto> accessListDto = accessService.getAccessDto(codeFz);

		assertThat(accessListDto).isNotEmpty();
	}

}
